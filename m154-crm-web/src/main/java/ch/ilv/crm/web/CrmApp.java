package ch.ilv.crm.web;

import static io.javalin.apibuilder.ApiBuilder.post;
import static io.javalin.apibuilder.ApiBuilder.get;

import ch.ilv.crm.web.Path;
import ch.ilv.crm.web.ViewUtil;
import ch.ilv.crm.web.controller.CustomerController;
import ch.ilv.crm.web.controller.ProductController;
import io.javalin.Javalin;
import io.javalin.staticfiles.Location;

public class CrmApp {
		
    public static void main(String[] args) {

    	
        Javalin app = Javalin.create()
            .port(7070)
            .enableStaticFiles("/public/", Location.CLASSPATH)
            .enableRouteOverview("/routes")
            .start();

        app.routes(() -> {
        	get(Path.Web.CUSTOMERS, CustomerController.showIndex);
        	post(Path.Web.CUSTOMER, CustomerController.selectCustomer);
        	post(Path.Web.CREATE_CUSTOMER, CustomerController.createCustomer);
        	
        	get(Path.Web.PRODUCTS, ProductController.showIndex);
        	post(Path.Web.PRODUCT, ProductController.selectProduct);
        	post(Path.Web.CREATE_PRODUCT, ProductController.createProduct);
        });
       

        app.error(404, ViewUtil.notFound);
    }
}
