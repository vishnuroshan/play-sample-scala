// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vishnu/Downloads/play-sample/conf/routes
// @DATE:Fri Dec 06 10:50:25 IST 2019


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
