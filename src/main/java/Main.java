/**
 * Created by Kyle Stainsby on 5/3/2017.
 */

import model.Post;
import model.PostDAO;
import model.SimplePostDAO;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;


public class Main {
    public static void main(String[] args) {

        PostDAO dao = new SimplePostDAO();


        get("/", (req, res) -> {
            return new ModelAndView(null, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/dashboard", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("name", req.cookie("name"));
            model.put("posts", dao.findAll());
            return new ModelAndView(model,"dashboard.hbs");
        }, new HandlebarsTemplateEngine());

        post("/create", (req, res) -> {
           res.cookie("name",req.queryParams("user"));
           System.out.println(req.queryParams("name"));
           String title = req.queryParams("title");
           String text = req.queryParams("text");
           String user = req.queryParams("user");
           Post newpost = new Post(title, text, user );
           dao.add(newpost);
           res.redirect("/dashboard");
           return "";
        });


    }





}
