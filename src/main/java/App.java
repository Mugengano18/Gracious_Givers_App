import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import java.util.HashMap;
import java.util.Map;
import static spark.Spark.*;

public class App {
    public static void main(String[] args){
        staticFileLocation("/public");
//        making a home pathway
        get("/",(request, response) ->{
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine() );

        get("/area",(request, response) ->{
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "area.hbs");
        }, new HandlebarsTemplateEngine() );
    }

    }
