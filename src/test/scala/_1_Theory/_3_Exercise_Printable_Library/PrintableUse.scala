package _1_Theory._3_Exercise_Printable_Library

import org.scalatest.flatspec.AnyFlatSpec



class PrintableUse extends AnyFlatSpec:

  "cat" should "be printable with implicit instance" in:

    final case class Cat(name: String, age: Int, color: String)

    given Printable[Cat] with
      def format(cat: Cat) = s"${cat.name} is a ${cat.age} year-old ${cat.color} cat."

    val cat = Cat("Garfield", 35, "orange and black")
    assert(Printable.format(cat) == "Garfield is a 35 year-old orange and black cat.")
    Printable.print(cat)

  "cat" should "be printable with extension method" in:

      final case class Cat(name: String, age: Int, color: String)

      import PrintableSyntax._

      given Printable[Cat] with
        def format(cat: Cat) = s"${cat.name} is a ${cat.age} year-old ${cat.color} cat."

      val cat = Cat("Garfield", 35, "orange and black")
      cat.print