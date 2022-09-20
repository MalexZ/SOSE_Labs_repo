
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

object conference_locations_list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

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
        <!--<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">


        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        -->
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.7.1/dist/leaflet.css" integrity="sha512-xodZBNTC5n17Xt2atTPuE1HxjVMSvLVW9ocqUKLsCC5CXdbqCmblAshOMAS6/keqq/sMZMZ19scR4PsZChSR7A=="
        crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.7.1/dist/leaflet.js" integrity="sha512-XQoYMqMTK8LvdxXYG3nZ448hOEQiglfqkJs1NOQV44cWnUrBc8PkAOcXy20w0vlaXaVUearIOBhiXZ5V3ynxwA=="
        crossorigin=""></script>
        <style>
                #mapid """),format.raw/*23.24*/("""{"""),format.raw/*23.25*/(""" """),format.raw/*23.26*/("""height: 360px; """),format.raw/*23.41*/("""}"""),format.raw/*23.42*/("""
        """),format.raw/*24.9*/("""</style>
    </head>
    <body>
        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #4cc9f0">
                <strong>Conference Titles</strong>
            </h1>
        </header>
        <p class="focused" style="font-size: 20px;
            color: #3F51B5">"""),_display_(/*34.30*/titles),format.raw/*34.36*/("""</p>
        <div id="mapid"></div>
        <script>

            var titles= """),_display_(/*38.26*/Html(titles.toString())),format.raw/*38.49*/(""";

            console.log(titles)
            alert(titles);







                var mymap = L.map('mapid').setView([51.505, -0.09], 2);
                console.log("After");
                console.log(mymap);
            L.tileLayer('https://api.mapbox.com/styles/v1/"""),format.raw/*52.59*/("""{"""),format.raw/*52.60*/("""id"""),format.raw/*52.62*/("""}"""),format.raw/*52.63*/("""/tiles/"""),format.raw/*52.70*/("""{"""),format.raw/*52.71*/("""z"""),format.raw/*52.72*/("""}"""),format.raw/*52.73*/("""/"""),format.raw/*52.74*/("""{"""),format.raw/*52.75*/("""x"""),format.raw/*52.76*/("""}"""),format.raw/*52.77*/("""/"""),format.raw/*52.78*/("""{"""),format.raw/*52.79*/("""y"""),format.raw/*52.80*/("""}"""),format.raw/*52.81*/("""?access_token="""),format.raw/*52.95*/("""{"""),format.raw/*52.96*/("""accessToken"""),format.raw/*52.107*/("""}"""),format.raw/*52.108*/("""', """),format.raw/*52.111*/("""{"""),format.raw/*52.112*/("""
                """),format.raw/*53.17*/("""attribution: 'Map data &copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors, Imagery © <a href="https://www.mapbox.com/">Mapbox</a>',
                maxZoom: 18,
                id: 'mapbox/streets-v11',
                tileSize: 512,
                zoomOffset: -1,
                accessToken: 'pk.eyJ1IjoiZ2lhbjk4OTgiLCJhIjoiY2t0cmlnNHo5MHVuMzJ3bGF3Mjh4YmRvYSJ9.EZv305bKMKlHKdk6ufMIBg'
            """),format.raw/*59.13*/("""}"""),format.raw/*59.14*/(""").addTo(mymap);

                var locations="""),_display_(/*61.32*/Html(titles.toString())),format.raw/*61.55*/(""";
                console.log(locations[0]);
                //var lon;
                //console.log();
                //for(location of locations)"""),format.raw/*65.45*/("""{"""),format.raw/*65.46*/("""
                """),format.raw/*66.17*/("""//add logic
                //"""),format.raw/*67.19*/("""}"""),format.raw/*67.20*/("""
                """),format.raw/*68.17*/("""for(let f = 0; f < locations.length; f++) """),format.raw/*68.59*/("""{"""),format.raw/*68.60*/("""
                    """),format.raw/*69.21*/("""fetch(location.protocol + '//nominatim.openstreetmap.org/search?format=json&q=' + locations[f])
                            .then(response => response.json())
                            .then(data => """),format.raw/*71.43*/("""{"""),format.raw/*71.44*/("""
                                """),format.raw/*72.33*/("""console.log(data[0].lon);
                                console.log(data[0].lat);
                                var popup = new L.marker([data[0].lat, data[0].lon]).bindPopup(locations[f]).addTo(mymap);
                            """),format.raw/*75.29*/("""}"""),format.raw/*75.30*/(""");
                """),format.raw/*76.17*/("""}"""),format.raw/*76.18*/("""

        """),format.raw/*78.9*/("""</script>

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
                  DATE: 2021-10-28T00:04:43.493
                  SOURCE: C:/Users/ZDreamer/Documents/GitHub/LabsRepo/Labs3Repo/Lab-3-Ebean/Frontend/app/views/conference_locations_list.scala.html
                  HASH: bd5d71a2b289db040016fe4827b473490c21b9e3
                  MATRIX: 651->1|689->33|1060->75|1176->98|2400->1296|2429->1297|2458->1298|2501->1313|2530->1314|2566->1323|2913->1643|2940->1649|3046->1728|3090->1751|3391->2024|3420->2025|3450->2027|3479->2028|3514->2035|3543->2036|3572->2037|3601->2038|3630->2039|3659->2040|3688->2041|3717->2042|3746->2043|3775->2044|3804->2045|3833->2046|3875->2060|3904->2061|3944->2072|3974->2073|4006->2076|4036->2077|4081->2094|4546->2531|4575->2532|4650->2580|4694->2603|4871->2752|4900->2753|4945->2770|5003->2800|5032->2801|5077->2818|5147->2860|5176->2861|5225->2882|5454->3083|5483->3084|5544->3117|5807->3352|5836->3353|5883->3372|5912->3373|5949->3383
                  LINES: 24->1|25->2|30->3|35->4|54->23|54->23|54->23|54->23|54->23|55->24|65->34|65->34|69->38|69->38|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|84->53|90->59|90->59|92->61|92->61|96->65|96->65|97->66|98->67|98->67|99->68|99->68|99->68|100->69|102->71|102->71|103->72|106->75|106->75|107->76|107->76|109->78
                  -- GENERATED --
              */
          