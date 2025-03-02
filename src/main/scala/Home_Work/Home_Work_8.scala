package Home_Work

object Set1 extends App {
  val x1 = Set(1,2,3)
  val x2 = Set(4,5,6)

  def sumset(x1:Set[Int], x2:Set[Int]) = {
    x1 ++ x2
  }

  println(sumset(x1,x2))
}

object Set2 extends App {
  val x1 = Set(1,2,3)
  val x2 = 2

  def setUn(x1:Set[Int], x2:Int) = {
    x1 - x2
  }

  println(setUn(x1,x2))
}

object Set3 extends App {
  val x1 = Set(1,2,3)
  val x2 = Set(2,3,6)

  def setUs(x1:Set[Int], x2:Set[Int]) = {
    (x1 -- x2) ++ (x2 -- x1)
  }

  println(setUs(x1,x2))
}

object Set4 extends App {
  val x1 = Map("1" -> Option(4), "2" -> Option(5), "3" -> Option(6))

  def setUm(x1:Map[String, Option[Int]]) = {
    x1.map { n =>
      val n1 = n._1
      val n2 = n._2.map(_ * 2)
      n1 -> n2
    }
  }

  println(setUm(x1))
}

object Set5 extends App {
  val x1: Map[String, Option[Int]] = Map("1" -> Option(4), "2" -> Option(5), "3" -> Option(6))

  def setUm(x1:Map[String, Option[Int]]): Map[String, Option[Int]] = {
    x1.map { n =>
      val n1 = n._1 + "1"
      val n2 = n._2.map(_ + 1)
      n1 -> n2
    }
  }

  println(setUm(x1))
}

object Set6 extends App {
  val x1: Map[String, Option[Int]] = Map("1" -> Option(4), "2" -> Option(5), "3" -> Option(6))

  def setUm(x1:Map[String, Option[Int]]): Map[String, Option[Int]] = {
    x1.map { n =>
      val n1 = n._1 + "1"
      val n2 = n._2.map(_ + 1)
      n1 -> n2
    }
  }

  println(setUm(x1))
}

object Set7 extends App {
  val x1: Map[String, Option[Int]] = Map("1" -> Option(4), "2" -> Option(5), "3" -> Option(-1), "4" -> Option(7))

  def setUz2(x1:Map[String, Option[Int]]) = {
    val (g1,g2) = x1.partition {
      case (_, Some(value)) => value > 0
      case _ => false
    }

    (g1,g2)
  }

  val (m1,m2) = setUz2(x1)
  println(m1)
  println(m2)
}

object Set8 extends App {
  val x1: Map[String, Option[Int]] = Map("1" -> Option(4), "2" -> Option(5), "3" -> Option(-1), "4" -> Option(7))
  val x2: Map[String, Option[Int]] = Map( "14" -> Option(-1), "15" -> Option(7),"1" -> Option(4), "2" -> Option(5))

  def setUz3(x1:Map[String, Option[Int]],x2:Map[String, Option[Int]]) = {
    val k1 = x1.keySet.intersect(x2.keySet)

    k1.map { k2 =>
      k2 -> Some(x1(k2).get + x2(k2).get)
    }.toMap
  }

  println(setUz3(x1,x2))
}

object Set9 extends App {
  val x1: Map[String, Option[Int]] = Map("1" -> Option(4), "2" -> Option(5), "3" -> Option(-1), "4" -> Option(7))
  val x2: Map[String, Option[Int]] = Map( "14" -> Option(-1), "15" -> Option(7),"1" -> Option(9), "2" -> Option(10))

  def setUz4(x1:Map[String, Option[Int]],x2:Map[String, Option[Int]]) = {

  }

  println(setUz4(x1,x2))
}
