
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

object Managementroom extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <link href="assets/stylesheets/Bos.css" rel="stylesheet">
    <title>Hello, world!</title>
</head>
<body>
   <form class = "body">
<h1>Hospital beds resrtvaion| System</h1>

<div class ="from-type">
    <p>เลือกประเภทอาคาร</p> 
        <select name=" building">
          <option value=" building1">อาคาร1</option>
          <option value="  building2">อาคาร2</option>
          <option value="building3" >อาคาร3</option>
          <option value="building4">อาคาร4</option>
        </select>
        
</div>

<button style = "background-image:url(assets/images/img.png)" class="button5"> </button>


    <div class="status">
        <p>แสดงสถานะ</p> <input type="radio" name="vehicle" value="free"> ว่าง<br>
                      <input type="radio" name="vehicle" value="Maintenance">ซ่อมบำรุง<br>
                      <input type="radio" name="vehicle" value="busy"> ไม่ว่าง<br>
                      <input type="radio" name="vehicle" value="Was booked">ถูกจอง<br>
                      <div class="form-row00">
                      <textarea rows="5" cols="60"> </textarea><br>
                      </div>
                      <div class = "form-row01">
                        <input type="submit" class = "form-row"value="ตกลง"style="width:60px;height:30px"><br>
                        <div class = "from-row02">
                            <input type="submit" class = "form-row"value="ยกเลิก"></div>
                          </div>

    
               
    </div>
    <button class="button">101</button><button class="button">102</button><button class="button">103</button><button class="button">104</button><button class="button">105</button><br>
    <button class="button">201</button><button class="button">202</button><button class="button">203</button><button class="button">204</button><button class="button">205</button><br>
    <button  class="button">301</button><button class="button">302</button><button class="button">303</button><button  class="button">304</button><button class="button">305</button><br>
    <button  class="button">401</button><button class="button">402</button><button class="button">403</button><button  class="button">404</button><button class="button">405</button><br>
    <button class="button">501</button><button class="button">502</button><button class="button">503</button><button class="button">504</button><button class="button">505</button>
  
</form>


<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
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
                  DATE: Thu Oct 18 21:29:34 ICT 2018
                  SOURCE: C:/Users/BOSS/IdeaProjects/Project_SE/app/views/Managementroom.scala.html
                  HASH: 5a823e9bd76ef1c5a5db8f5f7418266c606414d9
                  MATRIX: 1039->0
                  LINES: 33->1
                  -- GENERATED --
              */
          