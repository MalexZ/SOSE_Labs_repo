
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
/*1.2*/import play.api.libs.json.Json
/*2.2*/import scala.collection.JavaConverters._

object All_workflow extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(allWF: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Play Setup Demo</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">


        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />

        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.7.1/dist/leaflet.css" integrity="sha512-xodZBNTC5n17Xt2atTPuE1HxjVMSvLVW9ocqUKLsCC5CXdbqCmblAshOMAS6/keqq/sMZMZ19scR4PsZChSR7A=="
        crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.7.1/dist/leaflet.js" integrity="sha512-XQoYMqMTK8LvdxXYG3nZ448hOEQiglfqkJs1NOQV44cWnUrBc8PkAOcXy20w0vlaXaVUearIOBhiXZ5V3ynxwA=="
        crossorigin=""></script>

    </head>
    <body>
        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #4cc9f0">
                <strong>Show all workflows</strong>
            </h1>
        </header>

        <script>
              var workflows= """),_display_(/*33.31*/Html(allWF.toString())),format.raw/*33.53*/(""";

              for(let f = 0; f < workflows.length; f++) """),format.raw/*35.57*/("""{"""),format.raw/*35.58*/("""
                  """),format.raw/*36.19*/("""document.write(JSON.stringify(workflows[f]));
                  document.write("<br>")
                  document.write("<br>")
              """),format.raw/*39.15*/("""}"""),format.raw/*39.16*/("""

        """),format.raw/*41.9*/("""</script>

    </body>
</html>
"""))
      }
    }
  }

  def render(allWF:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(allWF)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (allWF) => apply(allWF)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-11-16T18:33:11.848
                  SOURCE: C:/Users/ZDreamer/Documents/GitHub/LabsRepo/Lab4Repo/Lab-4-Ebean/Frontend/app/views/All_workflow.scala.html
                  HASH: c7899340cd86ec943dc4ae645d2098014c3a94f9
                  MATRIX: 651->1|689->33|1047->75|1162->97|2612->1522|2655->1544|2742->1603|2771->1604|2818->1623|2988->1765|3017->1766|3054->1776
                  LINES: 24->1|25->2|30->3|35->4|64->33|64->33|66->35|66->35|67->36|70->39|70->39|72->41
                  -- GENERATED --
              */
          