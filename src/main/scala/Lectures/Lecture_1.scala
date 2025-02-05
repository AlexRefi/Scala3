package Lecture

object HelloWorld {
  def main(args: Array[String]) = {
    println("Hello World!")
  }
}

object Ints extends App {
  val x1: Int = 1
  val x2 = 2
  var x3 = 3
  x3 = 4
  println(x1)
  println(x2)
  println(x3)
  val x4 = {
    println("goal")
    5
  }
  println(x4)
}

object  Tipi extends App {
  val x1: Int = 1
  val x2: Long  = 1L
  val x3: Double = 1d
  val x4: Char = '1'
  lazy val x5: Byte  = ???
  //val x6: Nothing = ???
  val x7: String = "1"
  val x8: Boolean = false
  val x9: Unit = println("ggggg")
}

object stringi extends App {
  val x1 = "goal"
  val z1 = 1
  val z2 = 1L
  val x2 = s"$z1 +$z2 = ${z1+z2}"
  val x3 =
    s"""
       |$x1
       |""".stripMargin
  val x4 =
    s"""
       |$x1
       |"""
  println(x3+"\n---\n"+x4)
}

object Types extends App {
  //no x++ x--
  val x1 = 1 + 1
  val x2 = 1 - 1
  val x3 = 1 * 1
  val x4 = 1 / 1
  val x4_1 = 1 % 1
  val x5 = "1" + "1"
  //do not use equals, use Dva Ravno
  val x6 = "1" == "1"
  val x7 = "1" < "1" // > >= <= !=
}

object Tuples extends App {
  val x: (Int, String, Boolean) = (1, "2", false)
  val (i, l, b) = x
  val (i1, _, b1) = x
  val t2: (Int, String) = 1 -> "1"
  val x1: String = x._2
  val x2: Int = x._1

  type Id = Long
  def get(pId: Id) = {
    pId + 1
  }

  type ContactType = String
  type ContactValue = String
  val m: Map[Long, Map[String, String]] = ???
  val m1: Map[Id, Map[ContactType, ContactValue]] = ???
}

object JavaScalaTypes extends App {
  //import java.lang.Long
  import java.lang.{Long => JLong}//changing long appearance
  val x: Long = 1L
  val x1: JLong = null
  println(x1)
  val x2: Long = Long2long(x1)
  println(x2)
}

object DefFun extends App {
  def print(s: String): Unit = {
    println(s)
  }

  def print1(s: String): Unit = println(s)

  val f: String => Unit = (s: String) => println(s)

  val f1: String => Unit = s => println(s)

  def printAndGetTuple(i: Int, s: String): (Int, String) = {
    println(i)
    println(s)
    i -> s
  }

  val (x1, y1) = printAndGetTuple(1, "2")
  println(x1, y1)

  val f2: String => (Int, String) = printAndGetTuple(1, _)

  println(f("goal1"))
  println(f1("goal2"))
  println(f2("goal3"))
}

object DefParams extends App {
  def f(i:Int)(s:String): String = {
    s"$i $s"
  }
  val x = f(1)("2")
  println(x)
}