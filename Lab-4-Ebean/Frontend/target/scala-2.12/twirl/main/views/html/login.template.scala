
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

        <title>Lab 4 - Find best workflow
        </title>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js">
        </script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js">
        </script>

    </head>
    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #4cc9f0">
                <strong>Lab 4 - Find Optimal result Base on GA</strong>
            </h1>
        </header>

        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="card-panel">
                    <form action=""""),_display_(/*39.36*/routes/*39.42*/.HomeController.WFController()),format.raw/*39.72*/("""" method="GET">
                        <div class="row">
                            <button id="api-search-button" style="color: #4cc9f0; background: #031628;" class="btn col s4 offset-s4" type="submit">Find Best</button>
                        </div>
                    </form>

                </div>
            </div>
        </div>

    </body>
</html>

    <!--<script>
                $(document).ready(function ()"""),format.raw/*53.46*/("""{"""),format.raw/*53.47*/("""
                    """),format.raw/*54.21*/("""$('#load_csv').click(function()"""),format.raw/*54.52*/("""{"""),format.raw/*54.53*/("""
                        """),format.raw/*55.25*/("""$.ajax("""),format.raw/*55.32*/("""{"""),format.raw/*55.33*/("""
                            """),format.raw/*56.29*/("""url:"baseFVDataSet.csv",
                            dataType:"text",
                            success:function (data)"""),format.raw/*58.52*/("""{"""),format.raw/*58.53*/("""
                                """),format.raw/*59.33*/("""var workflow_data = data.split(/\r?\n|\r/);
                                var table_data = '<table class="table table-bordered table-striped">';
                                for (var count = 0;count < workflow_data.length;count++)"""),format.raw/*61.89*/("""{"""),format.raw/*61.90*/("""
                                    """),format.raw/*62.37*/("""var cell_data = workflow_data[count].split(",");
                                    table_data += '<tr>';
                                    for(var cell_count = 0;cell_count < cell_data.length;cell_count++)"""),format.raw/*64.103*/("""{"""),format.raw/*64.104*/("""
                                        """),format.raw/*65.41*/("""if(count === 0)"""),format.raw/*65.56*/("""{"""),format.raw/*65.57*/("""
                                            """),format.raw/*66.45*/("""table_data += '<th>'+cell_data[cell_count]+'</th>';
                                        """),format.raw/*67.41*/("""}"""),format.raw/*67.42*/("""else"""),format.raw/*67.46*/("""{"""),format.raw/*67.47*/("""
                                            """),format.raw/*68.45*/("""table_data += '<td>'+cell_data[cell_count]+'</td>';
                                        """),format.raw/*69.41*/("""}"""),format.raw/*69.42*/("""
                                    """),format.raw/*70.37*/("""}"""),format.raw/*70.38*/("""
                                    """),format.raw/*71.37*/("""table_data += '</tr>';
                                """),format.raw/*72.33*/("""}"""),format.raw/*72.34*/("""
                                """),format.raw/*73.33*/("""table_data += '</table>';
                                $('workflowTable').html(table_data);
                            """),format.raw/*75.29*/("""}"""),format.raw/*75.30*/("""
                        """),format.raw/*76.25*/("""}"""),format.raw/*76.26*/(""")
                    """),format.raw/*77.21*/("""}"""),format.raw/*77.22*/(""");
                """),format.raw/*78.17*/("""}"""),format.raw/*78.18*/(""");
        </script>-->"""))
      }
    }
  }

  def render(authorizeMessage:String): play.twirl.api.HtmlFormat.Appendable = apply(authorizeMessage)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (authorizeMessage) => apply(authorizeMessage)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-11-23T18:41:23.638
                  SOURCE: C:/Users/ZDreamer/Documents/GitHub/LabsRepo/Lab4Repo/Lab-4-Ebean/Frontend/app/views/login.scala.html
                  HASH: 471a4d2c74a4e8c947a44a7afd3f46e624f7a350
                  MATRIX: 948->1|1068->28|3027->1962|3042->1968|3093->1998|3546->2423|3575->2424|3624->2445|3683->2476|3712->2477|3765->2502|3800->2509|3829->2510|3886->2539|4035->2660|4064->2661|4125->2694|4388->2929|4417->2930|4482->2967|4720->3176|4750->3177|4819->3218|4862->3233|4891->3234|4964->3279|5084->3371|5113->3372|5145->3376|5174->3377|5247->3422|5367->3514|5396->3515|5461->3552|5490->3553|5555->3590|5638->3645|5667->3646|5728->3679|5879->3802|5908->3803|5961->3828|5990->3829|6040->3851|6069->3852|6116->3871|6145->3872
                  LINES: 28->1|33->2|70->39|70->39|70->39|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|87->56|89->58|89->58|90->59|92->61|92->61|93->62|95->64|95->64|96->65|96->65|96->65|97->66|98->67|98->67|98->67|98->67|99->68|100->69|100->69|101->70|101->70|102->71|103->72|103->72|104->73|106->75|106->75|107->76|107->76|108->77|108->77|109->78|109->78
                  -- GENERATED --
              */
          