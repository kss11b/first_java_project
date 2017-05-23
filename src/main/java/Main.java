/**
 * Created by Kyle Stainsby on 5/3/2017.
 */

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import static spark.Spark.get;
import static spark.Spark.post;


public class Main {
    public static void main(String[] args) {


        get("/", (req, res) -> {
            return new ModelAndView(null, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/dashboard", (req, res) -> {
            return new ModelAndView(null,"dashboard.hbs");
        }, new HandlebarsTemplateEngine());

        post("/login", (req, res) -> {
           req.session().attribute("name",req.attribute("name"));
           response.redirect("/login");
        });


    }





}
