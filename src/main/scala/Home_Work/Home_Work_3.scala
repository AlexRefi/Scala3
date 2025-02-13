package Home_Work

import javax.naming.RefAddr

object ScalaBook extends App {
  class Book(val Name:String, val Author:String, val Year:Int) {
    override def toString = s"Книга:$Name Автор:$Author Год:$Year"
  }

  object Book {
    def createBook(Name:String, Author:String, Year:Int): Book = new Book(Name, Author, Year)
  }

  println(Book.createBook("Тихий Ден","Озон",2024))
}

object ScalaShape extends App{
  class Shape() {
    def Area():Double = {
      0
    }
  }

  case class Circle(Radius:Double) extends Shape() {
    override def Area(): Double = Radius * Radius * 3.14
  }

  case class Square(Side1:Double) extends Shape() {
    override def Area(): Double = Side1 * Side1
  }

  case class Rectangle(Side1:Double, Side2:Double) extends Shape() {
    override def Area(): Double = Side1 * Side2
  }

  val s1 = new Circle(5)
  val s2 = new Square(10)
  val s3 = new Rectangle(10,15)

  def PrintArea(Shape:Shape) = {
    println(Shape.Area())
  }

  PrintArea(s1)
  PrintArea(s2)
  PrintArea(s3)
}