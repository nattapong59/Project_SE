// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/PT_Kittisak/IdeaProjects/Project_SE/conf/routes
// @DATE:Sat Oct 13 17:02:50 ICT 2018


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
