// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vishnu/Downloads/play-sample/conf/routes
// @DATE:Fri Dec 06 10:50:25 IST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_4: controllers.HomeController,
  // @LINE:8
  CountController_1: controllers.CountController,
  // @LINE:10
  AsyncController_3: controllers.AsyncController,
  // @LINE:13
  Assets_2: controllers.Assets,
  // @LINE:16
  DataController_0: controllers.DataController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_4: controllers.HomeController,
    // @LINE:8
    CountController_1: controllers.CountController,
    // @LINE:10
    AsyncController_3: controllers.AsyncController,
    // @LINE:13
    Assets_2: controllers.Assets,
    // @LINE:16
    DataController_0: controllers.DataController
  ) = this(errorHandler, HomeController_4, CountController_1, AsyncController_3, Assets_2, DataController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_4, CountController_1, AsyncController_3, Assets_2, DataController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(file:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """data""", """controllers.DataController.postData"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """data""", """controllers.DataController.getData"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mongo""", """controllers.DataController.mongoConnect"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_4.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_1.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_3.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_DataController_postData4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("data")))
  )
  private[this] lazy val controllers_DataController_postData4_invoker = createInvoker(
    DataController_0.postData,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DataController",
      "postData",
      Nil,
      "POST",
      this.prefix + """data""",
      """ example post method""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_DataController_getData5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("data")))
  )
  private[this] lazy val controllers_DataController_getData5_invoker = createInvoker(
    DataController_0.getData,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DataController",
      "getData",
      Nil,
      "GET",
      this.prefix + """data""",
      """ example get method""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_DataController_mongoConnect6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mongo")))
  )
  private[this] lazy val controllers_DataController_mongoConnect6_invoker = createInvoker(
    DataController_0.mongoConnect,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DataController",
      "mongoConnect",
      Nil,
      "GET",
      this.prefix + """mongo""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_4.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params@_) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_1.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params@_) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_versioned3_invoker.call(Assets_2.versioned(file))
      }
  
    // @LINE:16
    case controllers_DataController_postData4_route(params@_) =>
      call { 
        controllers_DataController_postData4_invoker.call(DataController_0.postData)
      }
  
    // @LINE:19
    case controllers_DataController_getData5_route(params@_) =>
      call { 
        controllers_DataController_getData5_invoker.call(DataController_0.getData)
      }
  
    // @LINE:21
    case controllers_DataController_mongoConnect6_route(params@_) =>
      call { 
        controllers_DataController_mongoConnect6_invoker.call(DataController_0.mongoConnect)
      }
  }
}
