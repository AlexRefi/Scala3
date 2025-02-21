package Home_Work

object ScalaMethods extends App {
  val o1 = Option(1) // Создает Контейнер содержащий 1
  val i  = Option.option2Iterable(o1)// превращает Контейнер в коллекцию

  val i1: Int             = o1.head             // возвращает первый элемент
  val o2: Option[Int]     = o1.headOption       // возвращает первый элемент в виде контейнера
  val i2: Int             = o1.last             // возвращает последний элемент
  val o3: Option[Int]     = o1.lastOption       // возвращает последний элемент в виде контейнера
  val l: Iterable[Int]    = o1.tail             // возвращает элементы кроме первого
  val o4: Iterable[Int]   = o1.take(1)          // возвращает первые n элементов
  val o4_1: Iterable[Int] = o1.takeWhile(_ > 1) // возвращает элементы пока они подходят под условие
  val o5: Option[Int]     = o1.find(_ > 1)      // возвращает первый элемент подходящий по условию
  val o6: Option[Int] = o1.collect {            // возвращает измененные элементы по условию ( как система функций )
    case i if i != 0 => 10 / i
    case i           => i * 2
  }
  val i3: Int           = o1.count(_ > 12)      // возвращает количество подходящих под условие элементов
  val i4: Int           = o1.sum                // возвращает сумму элементов
  val i5: Int           = o1.product            // возвращает произведение элементов
  val l1: Iterable[Int] = o1.drop(1)            // возвращает коллекцию без первых n элементов
  val l2: Iterable[Int] = o1.dropRight(1)       // возвращает коллекцию без последних n элементов
  val l3: Iterable[Int] = o1.dropWhile(_ > 1)   // возвращает коллекцию без первых n элементов подходящих под условие
  val o7: Int           = o1.fold(1)(_ + 1)     // складывает все значения в одно по данной функции
  val o8: String        = o1.foldLeft("1") { case (acc, e) => acc + e + 1 } // складывает все значения в одно по данной функции слева направо
  val o9: String        = o1.foldRight("1") { case (e, acc) => acc + e + 1 }// складывает все значения в одно по данной функции справа налево
}

object ScalaOption extends App {
  val o1 = Option(1)         // Some(1)
  val o2 = Option.empty[Int] // None
  val o3 = None              // None
  val o4 = Some(1)           // Some(1)
  val o5 = Option(null)      // None
  // val o6 = Some(null)

  val b1: Boolean = o1.isEmpty    //true если пусто
  val b2: Boolean = o1.isDefined  //true если есть чето
  val b3: Boolean = o1.nonEmpty   //тоже что и предыдущее

  val b4: Boolean = o1.contains(1)//true если содержит это значение

  val o_1: Option[Int] = o1.filter(_ > 0)    //возвращает если подходит под условие иначе None
  val o_2: Option[Int] = o1.filterNot(_ > 0) //возвращает если НЕ подходит под условие иначе None

  val b5: Boolean = o1.exists(_ > 0) // true если подходящий под условия
  val b6 = o1.forall(_ > 0) // true если подходящий под условия или пустой

  val i  = o1.get                                      // None => NoSuchElementException
  val i1 = o1.getOrElse(2)                             // if None => 2
  val i2 = o1.getOrElse(throw new Exception("babah!")) // if None => new Exception
}

object ScalaOptionProd extends App {
  def loadById(id: Long): String               = null
  def loadByContractNumber(cn: String): String = "123"
  val x: String =
    Option(loadById(1))
      .orElse(Option(loadByContractNumber("321")))//делает если не получилось первое
      .orElse(Option(loadByContractNumber("213")))
      .orElse(Option(loadByContractNumber("312")))
      .getOrElse("not found")
  println(x)
}

object ScalaOptionSomeSome extends App {
  val o: Option[Option[Int]] = Option(Option(1))
  // [[x]] flatten => [x]
  // [[[x]]] flatten => [[x]]
  // [[[x]]] flatten flatten => [x]
  val x: Option[Int] = o.flatten //Раскрывает на один контейнер
  println(x)                    // Some(1)
  println(Option(None).flatten) // None
}

object actualHW extends App {
  def divide5(x: Int): Int = x-5
  val test1 = Option(10)
  val test2 = test1.map(divide5)
  println(test2.getOrElse(0))
  println("----------")

  def checkWord(phrase: Option[String], word: String)={
    val phraseOpen: String = phrase.getOrElse("")
    if (phraseOpen.contains(word)){
      println("Слово найдено")
    }else{
      println("Слово не найдено")
    }
  }

  val o1= Some("Строка строка строка")
  val o2= Some("Не строка")
  val o3= None

  checkWord(o1, "Не")
  checkWord(o2, "Не")
  checkWord(o3, "Не")
  println("----------")

  def ager(age: Option[Int]) = {
    age.getOrElse(-1) match {
      case a1 if a1 < 0 => println("Что-то не так")
      case a2 if a2 < 13 => println("Ребенок")
      case a3 if a3 < 19 => println("Подросток")
      case a4 => println("Взрослый")
    }
  }

  val a1= Some(5)
  val a2= Some(15)
  val a3= Some(25)
  val a4= None

  ager(a1)
  ager(a2)
  ager(a3)
  ager(a4)
}