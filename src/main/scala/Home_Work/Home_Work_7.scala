package Home_Work

object MapList extends App {
  val l1: List[Int] = List(1, 2, 3, 4)
  val l2 = l1.map(_ + 1)
  println(l2)
}

object Enumchik extends App {
  object Clothes extends Enumeration {
    type Size = Value
    val XXS, XS, S, M, L, XL, XXL = Value

    def getSizes(x1: Clothes.Size, x2: Clothes.Size): List[Clothes.Size] = {
      Clothes.values.filter(el => el.id > x1.id && el.id < x2.id).toList
    }
  }

  val s1 = Clothes.getSizes(Clothes.XS, Clothes.XL)
  println(s1.mkString(", "))
}

object Weeker extends App {
  object Week extends Enumeration {
    type Day = Value
    val  Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday = Value

    def getDayAfter(x: Week.Day): Week.Day = {
      val x2 = if(x.id !=6){
        x.id+1
      }else {
        0
      }
      Week(x2)
    }
  }

  println(Week.getDayAfter(Week.Monday))
  println(Week.getDayAfter(Week.Sunday))

}

object Uniq extends App {
  def uniq(list: List[Int]): List[Int] = {
    list.distinct
  }

  val u1 = List(1,2,3,4,5,2,3,4)
  println(uniq(u1))
}


object OptAv extends App {
  def fun(list: List[Option[Int]]): Option[Double] = {
    var sum = 0
    var count = 0
    list.foreach {
      case Some(value) =>
        sum += value
        count += 1
      case None =>
    }
    if (count > 0) Some(sum / count) else None
  }

  val l1 = List(Some(5),Some(10),Some(15),None)
  println(fun(l1))
}

object OptSum extends App {
  def fun(list: List[Option[Int]]): Option[Int] = {
    var sum = 0
    var continue = true
    list.foreach {
      case Some(value) =>
        sum += value
      case None => continue = false
    }
    if (continue) Some(sum) else None
  }

  val l1 = List(Some(5),Some(10),Some(15),None)
  println(fun(l1))
  val l2 = List(Some(5),Some(10),Some(15))
  println(fun(l2))
}

object StringFilter extends App {
  def filter(list: List[Option[String]]): List[String] = {
    list.collect {
      case Some(str) if str.length > 5 => str
    }
  }

  val l1 = List(Some("Z"),Some("YAKnw"), Some("Privet"), Some("Gooooal"), None)
  println(filter(l1))
}

object TwoStrinFilter extends App {
  def sovpadeniya(l1: List[String], l2: List[String]): List[String] = {
    l1.intersect(l2)
  }

  val l1 = List("Gooal", "Z", "Avtovaz")
  val l2 = List("N", "Gooal", "V")
  println(sovpadeniya(l1, l2))
}

object ZadachaSoZvezdochkoi extends App {
  def Joj(l1: List[Int], l2: List[Int]): List[(Int, Int)] = {
    for {
      x1 <- l1
      x2 <- l2
    } yield (x1, x2)
  }

  val l1 = List(1,2,3,4,5)
  val l2 = List(13,14,15,16)
  println(Joj(l1, l2))
}