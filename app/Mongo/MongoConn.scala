package Mongo

import javax.inject.Singleton
import org.mongodb.scala.bson.collection.mutable.Document
import org.mongodb.scala.{MongoClient, MongoCollection, MongoDatabase}

class MongoConn {
  def initInstance(): MongoClient = MongoClient("mongodb://localhost")
}

@Singleton
object MongoDB {
  private val instance: MongoClient = new MongoConn().initInstance()
  private val db: MongoDatabase = instance.getDatabase("scala")

  def getDataBase: MongoDatabase = db

  def getCollection(dbName: String): MongoCollection[Document] = db.getCollection[Document](dbName)
}