
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

object paperTometadata_list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(metadata: List[String]):play.twirl.api.HtmlFormat.Appendable = {
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
                <strong>Metadata</strong>
            </h1>
        </header>
        <!--<p class="focused" style="font-size: 20px;
            color: #3F51B5">"""),_display_(/*32.30*/metadata),format.raw/*32.38*/("""</p>-->

        <script>
              metadata= """),_display_(/*35.26*/Html(metadata.toString())),format.raw/*35.51*/(""";
              element = JSON.stringify(metadata);
             // alert("hi");
              inputTitle = JSON.stringify(metadata, ["title"])

              inputTitle = inputTitle.substring(12);
              inputTitle = inputTitle.substring(0, inputTitle.length - 4)
              //alert(inputTitle);
              for(let f = 0; f < metadata.length; f++) """),format.raw/*43.56*/("""{"""),format.raw/*43.57*/("""
                  """),format.raw/*44.19*/("""document.write(JSON.stringify(metadata[f]));
                  document.write("<br>")
                  document.write("<br>")
              """),format.raw/*47.15*/("""}"""),format.raw/*47.16*/("""

              """),format.raw/*49.15*/("""document.write("<br>")
              document.write("<br>")
              document.write("*** WARNING: Although innacurate, here is the api request containing abstract bellow:***");


              fetch('https://api.aminer.org/api/search/pub/advanced?' + new URLSearchParams("""),format.raw/*54.93*/("""{"""),format.raw/*54.94*/("""
                  """),format.raw/*55.19*/("""term: inputTitle,
                  size: 1,
              """),format.raw/*57.15*/("""}"""),format.raw/*57.16*/("""))
              .then(response => response.json())
              .then(data => """),format.raw/*59.29*/("""{"""),format.raw/*59.30*/("""

                          """),format.raw/*61.27*/("""document.getElementById("displayResponse").innerHTML = JSON.stringify(data);
                      """),format.raw/*62.23*/("""}"""),format.raw/*62.24*/(""");

        </script>
        <details id="displayResponse">
        </details>



    </body>
</html>
"""))
      }
    }
  }

  def render(metadata:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(metadata)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (metadata) => apply(metadata)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-10-28T19:19:50.380
                  SOURCE: C:/Users/ZDreamer/Documents/GitHub/LabsRepo/Labs3Repo/Lab-3-Ebean/Frontend/app/views/paperTometadata_list.scala.html
                  HASH: 3af998bbc33e13e78d196c0923bd7b4156c24355
                  MATRIX: 651->1|689->33|1055->75|1173->100|2649->1551|2678->1559|2756->1610|2802->1635|3192->1997|3221->1998|3268->2017|3437->2158|3466->2159|3510->2175|3814->2451|3843->2452|3890->2471|3977->2530|4006->2531|4114->2611|4143->2612|4199->2640|4326->2739|4355->2740
                  LINES: 24->1|25->2|30->3|35->4|63->32|63->32|66->35|66->35|74->43|74->43|75->44|78->47|78->47|80->49|85->54|85->54|86->55|88->57|88->57|90->59|90->59|92->61|93->62|93->62
                  -- GENERATED --
              */
          