// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/BOSS/IdeaProjects/Project_SE/conf/routes
// @DATE:Tue Oct 16 14:50:20 ICT 2018


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
