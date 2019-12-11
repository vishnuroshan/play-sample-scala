package Mongo

import org.mongodb.scala.{Completed, Document, MongoCollection, Observer}

class MongoData {
  def insertOneDocument(collection: MongoCollection[Document], document: Document): Document = {
    collection.insertOne(document).subscribe(observer = new Observer[Completed] {
      override def onNext(result: Completed): Completed = println(s"onNext: $result")

      override def onError(e: Throwable): Unit = println(s"onError: $e")

      override def onComplete(): Unit = println("onComplete")
    })
  }

  def insertManyDocuments(collection: MongoCollection[Document], docs: Array[Document]): Array[Document] = {
    collection.insertOne(docs).subscribe(new Observer[Completed] {
      override def onNext(result: Completed): Completed = println(s"onNext: $result")

      override def onError(e: Throwable): Unit = println(s"onError: $e")

      override def onComplete(): Unit = println("onComplete")
    })
  }
}
