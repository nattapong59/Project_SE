package controllers;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
<<<<<<< HEAD
    public Result main() {
        return ok(views.html.main.render());
    }

    public Result booking(){
        return ok(views.html.booking.render());
    }
    public Result test(){
        return ok(views.html.test.render());
    }
    public Result check(){
        return ok(views.html.check.render());
    }
}
=======
    public Result index() {
        return ok(index.render("Your new application is ready."));
    }
    public Result MedicalData(){
        return ok(views.html.MedicalData.render());
    }
    public Result Employee(){
        return ok(views.html.Employee.render());
    }
    

}


>>>>>>> c1ae5811d6f85c87b86f877326f884c8b9ad24f7
