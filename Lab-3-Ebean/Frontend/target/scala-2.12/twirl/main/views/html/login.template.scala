
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(authorizeMessage: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Lab 3 - LDA Categories
        </title>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
    </head>
    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #4cc9f0">
                <strong>Lab 3 - LDA Categories</strong>
            </h1>
        </header>

        <style>
                table """),format.raw/*30.23*/("""{"""),format.raw/*30.24*/("""
                    """),format.raw/*31.21*/("""margin: 0 auto;
                    text-align: center;
                    border-collapse: collapse;
                    border: 1px solid #d4d4d4;
                    height: 500px;
                """),format.raw/*36.17*/("""}"""),format.raw/*36.18*/("""

                """),format.raw/*38.17*/("""tr:nth-child(even) """),format.raw/*38.36*/("""{"""),format.raw/*38.37*/("""
                    """),format.raw/*39.21*/("""background: #d4d4d4;
                """),format.raw/*40.17*/("""}"""),format.raw/*40.18*/("""

                """),format.raw/*42.17*/("""th, td """),format.raw/*42.24*/("""{"""),format.raw/*42.25*/("""
                    """),format.raw/*43.21*/("""padding: 10px 30px;
                """),format.raw/*44.17*/("""}"""),format.raw/*44.18*/("""

                """),format.raw/*46.17*/("""th """),format.raw/*46.20*/("""{"""),format.raw/*46.21*/("""
                    """),format.raw/*47.21*/("""border-bottom: 1px solid #d4d4d4;
                """),format.raw/*48.17*/("""}"""),format.raw/*48.18*/("""
        """),format.raw/*49.9*/("""</style>

        <!-- Table bellow -->

        <table id="fetch" border="2" cellspacing="1" cellpadding="8" class="table">

            <tr>

                <th>Categories</th>

                <th>Total</th>

            </tr>

            <script type="text/javascript">
                    var array = [
                        [0,54],
                        [1,132],
                        [2,101],
                        [3,62],
                        [4,38],
                        [5,83],
                        [6,71],
                        [7,152],
                        [8,96],
                        [9,94],
                        [10,55],
                        [11,60],
                        [12,57],
                        [13,52],
                        [14,86],
                        [15,51],
                        [16,113],
                        [17,66],
                        [18,82],
                        [19,55],
                        [20,53],
                        [21,75],
                        [22,132],
                        [23,72],
                        [24,102],
                        [25,31],
                        [26,76],
                        [27,37],
                        [28,126],
                        [29,21],
                        [30,69],
                        [31,85],
                        [32,139],
                        [33,50],
                        [34,133],
                        [35,29],
                        [36,135],
                        [37,54],
                        [38,80],
                        [39,86],
                        [40,62],
                        [41,53],
                        [42,41],
                        [43,75],
                        [44,65],
                        [45,48],
                        [46,139],
                        [47,118],
                        [48,57],
                        [49,54]];

                    //array to table


                    fetch = document.getElementById('fetch');

                    for(var i=0; i <array.length; i++)"""),format.raw/*121.55*/("""{"""),format.raw/*121.56*/("""

                        """),format.raw/*123.25*/("""var newRow = fetch.insertRow(fetch.length);

                        for(var j=0; j<array[i].length; j++)"""),format.raw/*125.61*/("""{"""),format.raw/*125.62*/("""

                            """),format.raw/*127.29*/("""var cell = newRow.insertCell(j);

                            cell.innerHTML = array[i][j];

                        """),format.raw/*131.25*/("""}"""),format.raw/*131.26*/("""

                    """),format.raw/*133.21*/("""}"""),format.raw/*133.22*/("""

            """),format.raw/*135.13*/("""</script>
        </table>
        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="card-panel">
                    <form action=""""),_display_(/*140.36*/routes/*140.42*/.HomeController.findCategoryArticles()),format.raw/*140.80*/("""" method="GET">

                        <div class="row">
                            <div class="input-field col s12">
                                <input id="category" name="category" type="text" class="validate">
                                <label for="category">category #</label>
                            </div>
                        </div>
                        <div class="row">
                            <button id="api-search-button" style="color: #4cc9f0; background: #031628;" class="btn col s4 offset-s4" type="submit">Submit</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(authorizeMessage:String): play.twirl.api.HtmlFormat.Appendable = apply(authorizeMessage)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (authorizeMessage) => apply(authorizeMessage)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-10-27T19:59:27.688
                  SOURCE: C:/Users/ZDreamer/Documents/GitHub/LabsRepo/Labs3Repo/Lab-3-Ebean/Frontend/app/views/login.scala.html
                  HASH: af127a329ac39fd123ef136df4e9021e0e1d7342
                  MATRIX: 948->1|1068->28|2567->1501|2596->1502|2645->1523|2874->1724|2903->1725|2949->1743|2996->1762|3025->1763|3074->1784|3139->1821|3168->1822|3214->1840|3249->1847|3278->1848|3327->1869|3391->1905|3420->1906|3466->1924|3497->1927|3526->1928|3575->1949|3653->1999|3682->2000|3718->2009|5867->4129|5897->4130|5952->4156|6086->4261|6116->4262|6175->4292|6321->4409|6351->4410|6402->4432|6432->4433|6475->4447|6681->4625|6697->4631|6757->4669
                  LINES: 28->1|33->2|61->30|61->30|62->31|67->36|67->36|69->38|69->38|69->38|70->39|71->40|71->40|73->42|73->42|73->42|74->43|75->44|75->44|77->46|77->46|77->46|78->47|79->48|79->48|80->49|152->121|152->121|154->123|156->125|156->125|158->127|162->131|162->131|164->133|164->133|166->135|171->140|171->140|171->140
                  -- GENERATED --
              */
          