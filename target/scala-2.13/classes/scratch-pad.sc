abstract class Person {
  val name: String
  val age: String

  def sendEmail(subject: String, body: String): Unit
}

object Nacho {
  var nacho_sec: String = "mango"

  private def friendFunc(): String = nacho_sec
}

class Nacho extends Person {
  override val age: String = ""
  override val name: String = ""

  override def sendEmail(subject: String, body: String): Unit = {}

  protected var aService: String = "ref"
  val decs: String = NachoSingle.singleTon()

  def printGenerics[Generics](as: Generics): Generics = as

  def getter(): String = {
    this.aService
  }

  def setter(value: String): Unit = {
    this.aService = value
  }

  object NachoSingle {
    def singleTon(): String = {
      "SingleTon"
    }
  }

  import Nacho._

  def findFlavour(): String = friendFunc()
}

var NachoObj = new Nacho()
var NachoObj1 = new Nacho()

//println(NachoObj.printGenerics("12121"),
//  NachoObj.printGenerics(111));

val name = "vishnu"

// string interpolation
println(s"my name is $name")

// case class is like java object; but without getter and setter
case class Donut(name: String, tasteLike: String);
val myFavDonut: Donut = Donut("glazed", "heavenly")
println(s"my fav type of donut is ${myFavDonut.name}, and it tastes ${myFavDonut.tasteLike}")