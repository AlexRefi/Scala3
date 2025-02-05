package Home_Work

object TaskSquare extends App {
  def Square(x: Int)= {
    x * x
  }
  println(Square(4))
  println(Square(-5))
  println(Square(127))
}

object TaskArea extends App {
  def Area(r: Double) = {
    val pi = 3.14
    r * pi * pi
  }
  println(Area(1))
  println(Area(54))
}

object TaskCelFar extends App {
  def Transf(cel: Double): Double = {
    cel * 1.8 + 32
  }
  println(Transf(10))
  println(Transf(232.8))
}

object TaskStringLength extends App  {
  def StringLength(Str: String): Int = {
    Str.length
  }
  println(StringLength("Gooooooal"))
}

object TaskLength extends App  {
  def Length(x: Double,y: Double): Double = {
    math.sqrt(x * x + y * y)
  }
  println(Length(4,3))
  println(Length(19,37))
}
