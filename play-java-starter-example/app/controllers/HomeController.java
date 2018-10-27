package controllers;

import play.mvc.*;

import views.html.*;

public class HomeController extends Controller {

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
