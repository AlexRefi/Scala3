package Home_Work

import scala.util.{Failure, Success, Try}

object EitherMap extends App {
  val z1 : Either[String, Int] = Right(165).map(_ + 4)
  println(z1)
  val z2 : Either[Int, String] = Right("Goooal").map(_ + " yea")
  println(z2)
}

object OptionHW extends App {
  def divisionOption(a: Int, b: Int): Option[Int] = {
    if (b == 0) None
    else Some(a / b)
  }

  val x1 = divisionOption(100, 2)
  println(x1)
  val x2 = divisionOption(54, 0)
  println(x2)
}

object TryHW extends App {
  def divisionTry(a: Double, b: Double): Try[Double] = Try {
    a/b
  }

  val x3 = divisionTry(100, 2)
  x3 match {
    case Failure(z) => println("Невозможно")
    case Success(value) => println(value)
  }

  val x4 = divisionTry(54, 0)
  x4 match {
    case Failure(z) => println("Невозможно")
    case Success(value) => println(value)
  }

}

object EitherHW extends App {
  def divisionEither(a: Double, b: Double): Either[String, Double] = {
    if (b == 0) Left("Невозможно")
    else Right(a / b)
  }

  val x5 = divisionEither(100, 2)
  println(x5)
  val x6 = divisionEither(54, 0)
  println(x6)
}

