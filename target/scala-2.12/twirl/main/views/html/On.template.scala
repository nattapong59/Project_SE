
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object On extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<html lang="en">
    <head>
      <!-- Required meta tags -->
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  
      <!-- Bootstrap CSS -->
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="assets/stylesheets/on.css" rel="stylesheet" >
      <title>Payment</title>
    </head>
    <body>
            <form>
                    <div class="form-row">
                      <div class="form-group col-md-6">
                        <label for="inputEmail4">ชื่อ</label>
                        <input type="text" class="form-control" id="inputEmail4" placeholder="ชื่อ">
                      </div>
                      <div class="form-group col-md-6">
                        <label for="inputPassword4">นามสกุล</label>
                        <input type="text" class="form-control" id="inputPassword4" placeholder="นามสกุล">
                      </div>
                    </div>
                   
                    <div class="form-group">
                      <label for="inputNumber">เลขบัตรประชาชน</label>
                      <input type="text" class="form-control" id="inputNumber" placeholder="เลขบัตรประชาชน">
                    </div>
                    <div class="form-row">
                            <div class="form-group col-md-6">
                              <label for="inputAddress2">ที่อยู่</label>
                              <input type="text" class="form-control" id="inputAddress2"placeholder="ที่อยู่">
                            </div>
                            <div class="form-group col-md-6">
                              <label for="inputAddress1">หมู่</label>
                              <input type="text" class="form-control" id="inputAddress1" placeholder="หมู่">
                            </div>
                                  <div class="form-group col-md-6">
                                        <label for="inputDistrict">อำเภอ/เขต</label>
                                        <input type="text" class="form-control" id="inputDistrict" placeholder="อำเภอ/เขต">
                                      </div>
                                      <div class="form-group col-md-6">
                                        <label for="inputCity1">จังหวัด</label>
                                        <input type="text" class="form-control" id="inputCity1" placeholder="จังหวัด">
                                      </div>
                          </div>

                    <div class="form-group">
                            <label for="exampleFormControlTextarea1"></label>
                            <textarea class="form-control" id="exampleFormControlTextarea1" rows="10"></textarea>
                            <button type="submit" class="btn btn-primary">ชำระเงิน</button>
                            <button type="submit" class="btn btn-primary">ยกเลิก</button>
                          </div>
                  </form>

  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
  </body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 27 16:54:41 ICT 2018
                  SOURCE: C:/Users/PT_Kittisak/IdeaProjects/Project_SE/app/views/On.scala.html
                  HASH: 8b53b5d15b4391b76e307f8835bc4caec0d54067
                  MATRIX: 1027->2
                  LINES: 33->2
                  -- GENERATED --
              */
          