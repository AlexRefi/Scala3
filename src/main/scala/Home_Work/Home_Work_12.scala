package Home_Work

object obFun extends App {
  def Fun[T](list: List[T]): T = {
    list.head
  }

  val list = List(1, 2, 3, 4)
  println(Fun(list))
}

object obFun2 extends App {
  def Fun[T](list: List[T]): List[T] = {
    list.distinct
  }

  val list = List(1, 2, 3, 4, 1, 3)
  println(Fun(list))
}

object obFun3 extends App {
  def Fun[T](list: List[T]): Int = {
    list.size
  }

  val list = List(1, 2, 3, 4, 1, 3, 44444)
  println(Fun(list))
}

object obFun4 extends App {
  def Fun[T, U](list: List[T])(f: T => U): List[U] = {
    list.map(f)
  }

  val list = List(1, 2, 3, 4, 1, 3, 44444, 229)
  println(Fun(list)(x => x*3))
}

