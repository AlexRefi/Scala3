package Home_Work

object funcRow extends App {

  def funcRow(x: Int, row: List[Int => Int]): Int = {
    row.foldLeft(x)((acc, e) => e(acc))
  }

  val z1 = 10

  val fL = List((x: Int) => x * 5,(x: Int) => x + 5,(x: Int) => x - 3)

  println(funcRow(z1,fL))

}

object funcRealRow extends App {

  def funcRealRow(row: List[Int => Int]): Int => Int = {
    row.foldLeft((x: Int) => x)((acc, e) => x =>e(acc(x)))
  }

  val z1 = 10

  val fL = List((x: Int) => x * 5,(x: Int) => x + 5,(x: Int) => x - 3)

  val z2 = funcRealRow(fL)(z1)

  println(z2)

}

object funcYa extends App {
  def sum(x: Int)(y: Int) = x + y

  def halfSum(f1: Int => Int => Int): Int => (Int => Int) = {
    (x: Int) => f1(x)
  }

  val z1 = 5
  val z2 = 10
  val z3 = halfSum(sum)(z1)
  val z4 =z3(z2)
  println(z4)

}

object funcThree extends App {
  def print3(s1: String, i1: Int, d1: Double): String = {
    s1 + i1 + d1
  }

  println(print3("Счёт ", 3, 3.55))

  def carPrint(f: (String, Int, Double) => String): String => (Int, Double) => String = {
    (s1: String) => (i1: Int, d1: Double) => f(s1, i1, d1)
  }

  val z1 = "Гол  "
  val z2 = 6
  val z3 = 4.22
  val z4 = carPrint(print3)
  val z5 = z4(z1)
  val z6 = z5(z2,z3)
  println(z6)
}

