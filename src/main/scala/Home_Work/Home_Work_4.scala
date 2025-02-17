package Home_Work

object Shapes extends App {
  trait Shape {
    val area: Double
    def getArea: Double = 0
  }

  case class Circle(Radius:Double) extends Shape {
    override def getArea: Double = Radius * Radius * 3.14

    override val area: Double = Radius * Radius * 3.14
  }

  val c1 = Circle(5)

  case class Square(Side1:Double) extends Shape {
    override def getArea: Double = Side1 * Side1

    override val area: Double = Side1 * Side1
  }

  val s1 = Square(10)

  case class Rectangle(Side1:Double, Side2:Double) extends Shape {
    override def getArea: Double = Side1 * Side2

    override val area: Double = Side1 * Side2
  }

  val r1: Shape = Rectangle(10,15)

  def printShapeArea(obj:Shape)= {
    obj match {
      case Rectangle(s1, s2) => println(s"Прямоугольник S=${obj.getArea}")
      case Square(s1) => println(s"Квадрат S=${obj.getArea}")
      case Circle(r) => println(s"Круг S=${obj.getArea}")
    }
  }

  printShapeArea(c1)
  printShapeArea(s1)
  printShapeArea(r1)

  def printShapeArea2(obj:Shape)= {
    obj match {
      case g1: Rectangle => println(s"Прямоугольник S=${g1.getArea}")
      case g2: Square => println(s"Квадрат S=${g2.getArea}")
      case g3: Circle if g3.Radius == 0 => println(s"Точка")
      case g4: Circle => println(s"Круг S=${g4.getArea}")
    }
  }

  val r2: Shape = Rectangle(5,6)
  printShapeArea2(r2)

  val c2: Shape = Circle(0)
  printShapeArea2(c2)

}

object Logger extends App {
  sealed trait AppMessage
  case class Error(mes: String) extends AppMessage
  case class InfoMessage(mes: String) extends AppMessage
  case class Warning(mes: String) extends AppMessage

  def logIt(mesLog:AppMessage)= {
    mesLog match {
      case Error(mes) => println(s"\u001B[31m Ошибка:$mes \u001B[0m")
      case InfoMessage(mes) => println(s"\u001B[34m Информация:$mes \u001B[0m")
      case Warning(mes) => println(s"\u001B[33m Предупреждение:$mes \u001B[0m")
    }
  }

  val msg1: AppMessage = Error("Ошибка z4")
  logIt(msg1)

  val msg2: AppMessage = InfoMessage("Внимание z5")
  logIt(msg2)

  val msg3: AppMessage = Warning("Предупреждение z6")
  logIt(msg3)

}