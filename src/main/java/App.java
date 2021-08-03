import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        get("/", (request, response) -> {
            return new ModelAndView(new HashMap(), "hello.hbs");

        }, new HandlebarsTemplateEngine());


        get("/favourite-photos", (request, response) -> {
            return new ModelAndView( new HashMap(), "favourite-photos.hbs");
                }, new HandlebarsTemplateEngine());




    }
}

