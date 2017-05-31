/**
 * Created by Kyle Stainsby on 5/3/2017.
 */

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.Map;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.Spark.post;


public class Main {
    public static void main(String[] args) {

        postDAO.java dao = new SimplePostDAO();


        get("/", (req, res) -> {
            return new ModelAndView(null, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/dashboard", (req, res) -> {
            Map<String, String> model = new HashMap<>();
            model.put("name", req.cookie("name"));
            return new ModelAndView(model,"dashboard.hbs");
        }, new HandlebarsTemplateEngine());

        post("/login", (req, res) -> {
           res.cookie("name",req.queryParams("name"));
           System.out.println(req.queryParams("name"));
           res.redirect("/dashboard");
           return "";
        });


    }





}
