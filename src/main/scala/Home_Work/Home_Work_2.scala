package Home_Work

object TaskChet extends App {
  def Chet(ch: Int) = {
    print(s"Число $ch ")
    if (ch % 2 == 1) {println("нечетное.")}
    else {println("четное.")}
  }
  Chet(4)
  Chet(5)
  Chet(0)
}

object TaskPoloj extends App {
  def Testpol(ch: Int) = {
    print(s"Число $ch ")
    if (ch == 0) {println("равно 0.")}
    else if (ch > 0) {println("больше 0.")}
    else {println("меньше 0.")}
  }
  Testpol(-1)
  Testpol(1)
  Testpol(0)
}

object Task10 extends App {
  def Print10S() = {
    for (i <- 1 to 10) println(i)
  }
  def Print10Bez() = {
    for (i <- 1 until 10) println(i)
  }
  Print10S()
  Print10Bez()
}

object TaskTabl extends App {
  def PrintTabl() = {
    for (i <- 1 to 10) println(s"5 * $i = ${i*5}")
  }
  PrintTabl()
}

object TaskFib extends App {
  def Fib(ch: Int): Int = {
    if ( ch <= 2) {
      1
    }
    else {
      Fib(ch-1)+Fib(ch-2)
    }
  }
  for (i <- 1 to 10) println(Fib(i))
}

object TaskFibTail extends App {
  def Fib(ch: Int): Int = {
    import scala.annotation.tailrec
    @tailrec
    def FibTail(schet: Int, FibNow: Int, FibNext: Int): Int = {
      if (schet == 0) {
        FibNow
      }
      else {
        FibTail(schet - 1, FibNext, FibNow + FibNext)
      }
    }
    FibTail(ch-1, 1, 1)
  }
  for (i <- 1 to 10) println(Fib(i))
}