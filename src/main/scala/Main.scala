import scala.util.Random

case class Class1(id: Int, description: String, kind: Option[Int])

object Main extends App {

  //Первое задание
  def isOdd(obj: Class1): String = {
    obj.kind match {
      case None => "неизвестно"
      case Some(k) if k % 2 == 0 => "чётное"
      case Some(k) => obj.description
    }
  }

  var noneObj = Class1(1, "Первый пример", None)
  println(s"Результат для noneObj: ${isOdd(noneObj)}")

  var oddObj = Class1(2, "Ещё один пример", Some(5))
  println(s"Результат для oddObj: ${isOdd(oddObj)}")

  var evenObj = Class1(3, "Последний пример", Some(10))
  println(s"Результат для evenObj: ${isOdd(evenObj)}")

  //Второе задание
  var random = new Random()
  var array = Seq.fill(10)(random.nextInt(10)+1)
  println("Последовательность:")
  println(array)

  var sum = array.filter(_ % 2 != 0).sum
  println(s"Сумма нечётных элементов последовательности равна $sum")
}