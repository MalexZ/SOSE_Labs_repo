
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

object category_titles extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(titles: List[String]):play.twirl.api.HtmlFormat.Appendable = {
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
                <strong>Paper Titles</strong>
            </h1>
            <details>
                Simply copy desired selection in input box
            </details>
        </header>

        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="card-panel">
                    <form action=""""),_display_(/*38.36*/routes/*38.42*/.HomeController.outputMetadata()),format.raw/*38.74*/("""" method="GET">

                        <div class="row">
                            <div class="input-field col s12">
                                <input id="title" name="title" type="text" class="validate">
                                <label for="title">Paper Title</label>
                            </div>
                        </div>
                        <div class="row">
                            <button id="api-search-button" style="color: #4cc9f0; background: #031628;" class="btn col s4 offset-s4" type="submit">Submit</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <style>
                table """),format.raw/*55.23*/("""{"""),format.raw/*55.24*/("""
                    """),format.raw/*56.21*/("""margin: 0 auto;
                    text-align: center;
                    border-collapse: collapse;
                    border: 1px solid #d4d4d4;
                    height: 500px;
                """),format.raw/*61.17*/("""}"""),format.raw/*61.18*/("""

                """),format.raw/*63.17*/("""tr:nth-child(even) """),format.raw/*63.36*/("""{"""),format.raw/*63.37*/("""
                    """),format.raw/*64.21*/("""background: #d4d4d4;
                """),format.raw/*65.17*/("""}"""),format.raw/*65.18*/("""

                """),format.raw/*67.17*/("""th, td """),format.raw/*67.24*/("""{"""),format.raw/*67.25*/("""
                    """),format.raw/*68.21*/("""padding: 10px 30px;
                """),format.raw/*69.17*/("""}"""),format.raw/*69.18*/("""

                """),format.raw/*71.17*/("""th """),format.raw/*71.20*/("""{"""),format.raw/*71.21*/("""
                    """),format.raw/*72.21*/("""border-bottom: 1px solid #d4d4d4;
                """),format.raw/*73.17*/("""}"""),format.raw/*73.18*/("""
        """),format.raw/*74.9*/("""</style>
            <table id="fetch2" border="2" cellspacing="1" cellpadding="8" class="table">

                <tr>

                    <th>Articles</th>

                </tr>

                <script type="text/javascript">

                        //array to table
                        //element = "Y||X||Z"
                            data= """),_display_(/*87.36*/Html(titles.toString())),format.raw/*87.59*/(""";
                                fetch2 = document.getElementById('fetch2');
                            element= JSON.stringify(data);

                            element = element.substring(2);
                            element = element.substring(0, element.length - 2)
                            array2 = element.split("||");

                            alert(element);
                            alert(array2.length);
                            alert(array2);



                            for(var i=0; i <array2.length; i++)"""),format.raw/*101.64*/("""{"""),format.raw/*101.65*/("""



                                """),format.raw/*105.33*/("""var newRow = fetch2.insertRow(fetch2.length);

                                var cell = newRow.insertCell(0);

                                cell.innerHTML = array2[i].concat('.');

                            """),format.raw/*111.29*/("""}"""),format.raw/*111.30*/("""



                """),format.raw/*115.17*/("""</script>

        </body>
</html>
"""))
      }
    }
  }

  def render(titles:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(titles)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (titles) => apply(titles)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-10-28T18:08:55.195
                  SOURCE: C:/Users/ZDreamer/Documents/GitHub/LabsRepo/Labs3Repo/Lab-3-Ebean/Frontend/app/views/category_titles.scala.html
                  HASH: 431ac8170221f64c9b06bd411e26fd7fb1af5f3d
                  MATRIX: 651->1|689->33|1050->75|1166->98|2818->1725|2833->1731|2886->1763|3625->2474|3654->2475|3703->2496|3932->2697|3961->2698|4007->2716|4054->2735|4083->2736|4132->2757|4197->2794|4226->2795|4272->2813|4307->2820|4336->2821|4385->2842|4449->2878|4478->2879|4524->2897|4555->2900|4584->2901|4633->2922|4711->2972|4740->2973|4776->2982|5157->3336|5201->3359|5769->3898|5799->3899|5864->3935|6107->4149|6137->4150|6186->4170
                  LINES: 24->1|25->2|30->3|35->4|69->38|69->38|69->38|86->55|86->55|87->56|92->61|92->61|94->63|94->63|94->63|95->64|96->65|96->65|98->67|98->67|98->67|99->68|100->69|100->69|102->71|102->71|102->71|103->72|104->73|104->73|105->74|118->87|118->87|132->101|132->101|136->105|142->111|142->111|146->115
                  -- GENERATED --
              */
          