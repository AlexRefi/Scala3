package Lectures

object ScalaClasses extends App {
  class A
  val a1 = new  A()

  class Point(val x: Int, val y: Int) {
    def distance(other: Point) ={

    }

    //override def toString: String = s
  }
  val p = new Point(1,2)


}

object ScalaClassesWithVar extends App {}

object ScalaClassesWithDefaultParam extends App {}

object ScalaClassesWithAuxiliaryConstrucnors extends App {}

object ScalaClassesWithAuxiliaryConstrucnorsV2 extends App {}

object ScalaClassesExtends extends App {}

object ScalaCaseClasses extends App {}

object ScalaObjects extends App {}

object ScalaCompanionObjects extends App {}