package controllers

import javax.inject._
import org.mongodb.scala.{Completed, Document, MongoCollection, MongoDatabase, Observable, Observer}

import scala.Predef._
//import org.mongodb.scala.MongoClient
import play.api.libs.json.{JsObject, Json}
import play.api.mvc._

@Singleton
class DataController @Inject()(data: ControllerComponents)(implicit assetsFinder: AssetsFinder) extends AbstractController(data) {
  // POST
  def postData: Action[AnyContent] = Action { request =>
    var body = request.body.asJson.get
    body = body.as[JsObject] + ("conn" -> Json.toJson(3))
    println(data.parsers)
    Ok(body)
  }

  def mongoConnect: Action[AnyContent] = Action { request =>
    val db: MongoDatabase = Mongo.MongoDB.getDataBase
    val collection: MongoCollection[Document] = db.getCollection[Document]("test");
    val document: Document = Document(ArrowAssoc("_id") -> 3, ArrowAssoc("x") -> 1)
    val insertObservable: Observable[Completed] = collection.insertOne(document)

    insertObservable.subscribe(new Observer[Completed] {
      override def onNext(result: Completed): Unit = println(s"onNext: $result")

      override def onError(e: Throwable): Unit = println(s"onError: $e")

      override def onComplete(): Unit = println("onComplete")
    })
    val findQuery: Document = Document(ArrowAssoc("_id") -> 2)
    collection.find(findQuery).collect().subscribe((results: Seq[Document]) => println(s"Found: #${results}"))


    Ok("Message me!!")
  }

  // GET
  def getData: Action[AnyContent] = Action { request =>
    // no idea what it's doing, have to read more...
    val query = request.queryString.map { case (k, v) => k -> v.mkString }
    println(query)
    Ok(Json.toJson(query))
  }
}