package _1_Introduction._4_MEET_CATS._6_Exercise_Cat_Show

import org.scalatest.flatspec.AnyFlatSpec

class PrintableCatWithCats extends AnyFlatSpec:
  final case class Cat(name: String, age: Int, color: String)

  "PrintableCatWithCats" should "print cat" in:
    import cats.Show
    import cats.syntax.show._

    implicit val catShow: Show[Cat] =
      Show.show(cat => s"${cat.name} is a ${cat.age} year-old ${cat.color} cat.")

    val cat = Cat("Garfield", 38, "ginger and black")
    assert(cat.show == "Garfield is a 38 year-old ginger and black cat.")
