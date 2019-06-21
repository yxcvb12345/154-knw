package ch.ilv.crm.web.controller;

import java.util.HashMap;
import java.util.Map;

import ch.ilv.crm.business.customer.CustomerFactory;
import ch.ilv.crm.business.customer.ICustomer;
import ch.ilv.crm.web.Path;
import io.javalin.Handler;

public class CustomerController {
    public static Handler selectCustomer = ctx -> {
        Map<String, Object> model = new HashMap<String, Object>();
       
        int customerId = Integer.parseInt(ctx.formParam("customerId"));
        
        ICustomer customer = CustomerFactory.getInstance().findCustomer(customerId);
        
        model.put("customer", customer);
        ctx.render(Path.Template.CUSTOMER, model);
    };
    
    public static Handler createCustomer = ctx -> {
        Map<String, Object> model = new HashMap<String, Object>();
        
        String firstname = ctx.formParam("firstname");
        String name = ctx.formParam("name");
        
        ICustomer newCustomer = CustomerFactory.getInstance().createCustomer(name, firstname);
        CustomerFactory.getInstance().saveCustomer(newCustomer);
        
        model.put("msg", "Customer " + firstname + " " + name + " saved!");
        ctx.render(Path.Template.CUSTOMERS, model);
    };
    
    public static Handler showIndex = ctx -> {
        ctx.render(Path.Template.CUSTOMERS);
    };
}
