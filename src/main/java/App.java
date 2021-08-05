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


        get( "/form.hbs", (request, response) -> {
            return new ModelAndView(new HashMap(), "form.hbs");
        }, new HandlebarsTemplateEngine());

        get("/grreeting-cards", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String recipient = request.queryParams("recipient");
            String sender = request.queryParams("sender");
            model.put("recipient", recipient);
            model.put("sender", sender);
            return new ModelAndView(new HashMap(), "grreeting-cards.hbs");

                },new HandlebarsTemplateEngine());




    }
}

