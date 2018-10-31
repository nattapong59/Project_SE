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
    public Result check(){
        return ok(views.html.check.render());
    }
    public Result rules(){
        return ok(views.html.rules.render());
    }
    public Result medical_data(){
        return ok(views.html.medical_data.render());
    }
    public Result management_employee(){
        return ok(views.html.management_employee.render());
    }
    public Result management_room() {
        return ok(views.html.management_room.render());
   }
   public Result payment(){
       return ok(views.html.payment.render());
   }


}
