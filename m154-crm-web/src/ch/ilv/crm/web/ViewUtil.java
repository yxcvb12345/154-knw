package ch.ilv.crm.web;

import io.javalin.ErrorHandler;

public class ViewUtil {

    public static ErrorHandler notFound = ctx -> {
        ctx.render(Path.Template.NOT_FOUND);
    };
    

}
