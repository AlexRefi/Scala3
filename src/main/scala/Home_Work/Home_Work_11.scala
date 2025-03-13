package Home_Work

object impProd extends App {
  val ch1 = 15
  implicit class nice(x: Int) {
    def prod10 = x * 10
  }
  val ch2 = ch1.prod10
  println(ch2)
}

object impCheck extends App {
  val ch1 = 15
  implicit class nice(x: Int) {
    def check2: Boolean = {
    x % 2 == 0
    }
  }
  println(s"Число $ch1 четное? => ${ch1.check2}")
}

object impMoney extends App {
  val ch1: Double = 15
  implicit val dirtyPaper: Double = 94.37
  def convertMoney(x: Double)(implicit c: Double)  = {
    x * c
  }
  println(s"$ch1 долларов => ${convertMoney(ch1)}")
}

object impOrd extends App {
  case class Person (name: String, age: Int)
  implicit val Ord: Ordering[Person] = Ordering.by(_.age)

  val l1: List[Person] = List(Person("John",20),Person("Ying",25),Person("Frank",15),Person("Chel",30),Person("Mark",10))
  println(l1)

  println("-----------------------")

  val l2: List[Person] = l1.sorted
  println(l2)
}