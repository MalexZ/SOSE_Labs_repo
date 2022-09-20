
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ZDreamer/Documents/GitHub/Labs/CS5340-7340-8391-[Giancarlo Rinaldini, Chenqi Zhang]-lab2/Lab-2-Ebean/ebean-backend/conf/routes
// @DATE:Tue Sep 20 14:59:50 CDT 2022


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
