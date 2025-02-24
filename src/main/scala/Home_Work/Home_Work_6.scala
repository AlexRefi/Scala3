package Home_Work

import scala.util.{Failure, Success, Try}



object TryHW extends App {
  def divisionTry(a: Double, b: Double): Try[Double] = Try {
    a/b
  }

  val x2 = divisionTry(21,100)
  x2 match {
    case Failure(exception) =>
      println(exception.getMessage)
    case Success(value) =>
      println(value)
  }

}