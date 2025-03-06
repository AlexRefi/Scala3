package Home_Work

object HWW extends App {
  val chisl: List[Double] = List(1, 4, 6, 9, 15, 16, 23, 25, 44)

  def squareRoot: PartialFunction[Double,Double] = {
    case x if x >= 0 => Math.sqrt(x)
  }

  def filterRoot(chisl: List[Double]): List[Double] = {
    chisl.collect(squareRoot)
  }

  println(filterRoot(chisl))
}