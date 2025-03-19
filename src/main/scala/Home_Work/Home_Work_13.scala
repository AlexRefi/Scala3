package Home_Work

import java.util.concurrent.Executors
import scala.concurrent.{Await, ExecutionContext, Future}
import scala.concurrent.duration.Duration
import scala.util.{Failure, Random, Success, Try}

object listLen extends App {
  val pool        = Executors.newFixedThreadPool(4)
  implicit val ec = ExecutionContext.fromExecutor(pool)

  def lenL (l1: List[String]): List[Future[Int]] = {
    l1.map {
      x => Future {x.length}
    }
  }

  val z1 = List("aaaaa","VV","Goal")

  val z2: List[Future[Int]] = lenL(z1)

  val z3: List[Int] = z2.map { x =>
    Await.result(x, Duration.Inf)
  }

  pool.shutdown()
  println(z3)
}

object sumFut extends App {
  val pool        = Executors.newFixedThreadPool(4)
  implicit val ec = ExecutionContext.fromExecutor(pool)

  def sumCh (l1: List[Future[Int]]): Future[Int] = {
    val acc1: Future[Int] = Future(0)

    l1.foldLeft(acc1) { (x1, x2) =>
      for {
        acc <- x1
        value <- x2
      } yield acc + value
    }

  }

  val z1: List[Future[Int]] = List(Future(3), Future(4), Future(5))

  val z2: Int = Await.result(sumCh(z1), Duration.Inf)

  pool.shutdown()
  println(z2)
}

object UpUpFut extends App {
  val pool        = Executors.newFixedThreadPool(4)
  implicit val ec = ExecutionContext.fromExecutor(pool)

  def UpFut(l1: List[Future[String]]): Future[List[String]] = {
    val l2: Future[List[String]] = Future.sequence(l1)

    l2.map { x =>
      x.map(_.toUpperCase)
    }
  }
  val l1: List[Future[String]] = List(Future("za"), Future("vdv"))

  val l2: Future[List[String]] = UpFut(l1)

  val l3: List[String] = Await.result(l2, Duration.Inf)

  pool.shutdown()
  println(l3)
}

object megaSum extends App {
  val pool        = Executors.newFixedThreadPool(4)
  implicit val ec = ExecutionContext.fromExecutor(pool)

  def f1: Future[Int] = Future {
    Thread.sleep(Random.nextInt(1000))
    5
  }

  def f2: Future[Int] = Future {
    Thread.sleep(Random.nextInt(1000))
    10
  }

  def f3(f1: Future[Int], f2: Future[Int]) = {
    val x: Future[Int] = for {
      x1 <- f1
      x2 <- f2
    } yield x1 + x2
    x
  }

  val f4 = f3(f1,f2)
  val f5: Int = Await.result(f4, Duration.Inf)
  pool.shutdown()
  println(f5)

}