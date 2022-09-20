
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ZDreamer/Documents/GitHub/LabsRepo/Lab4Repo/Lab-4-Ebean/ebean-backend/conf/routes
// @DATE:Tue Nov 16 18:32:55 CST 2021

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:18
  class ReverseController14(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def output14: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Controller14.output14",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "productiveResearcher"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseController1321(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def output1321: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Controller1321.output1321",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paperofResearcher"})
        }
      """
    )
  
  }

  // @LINE:37
  class ReverseworkflowController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def findBestWF: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.workflowController.findBestWF",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "find-best-workflow"})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseConferenceController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def findConferenceLocations: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ConferenceController.findConferenceLocations",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "find-conference-locations"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseController12(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def output12: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Controller12.output12",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "journalMetadata"})
        }
      """
    )
  
  }

  // @LINE:27
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:31
    def registerNew: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.registerNew",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:35
  class ReverseCategoryArticlesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def findCategoryArticles: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryArticlesController.findCategoryArticles",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "find-category-articles"})
        }
      """
    )
  
  }

  // @LINE:39
  class ReverseallWorkflowController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def findAllWF: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.allWorkflowController.findAllWF",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "find-all-workflow"})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseController11(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def outputMetadata: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Controller11.outputMetadata",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "inPnameOutMetadata"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseController22(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def output22: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Controller22.output22",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "coautherOfPResearcher"})
        }
      """
    )
  
  }


}
