package _1_Theory._5_Example_Eq._5_Exercise_Equality_Liberty_and_Felinity

import cats.Eq
import org.scalatest.flatspec.AnyFlatSpec

class CatEqTest extends AnyFlatSpec:

  final case class Cat(name: String, age: Int, color: String)

  import cats.syntax.eq._
  import cats.syntax.option._

  val cat1: Cat = Cat("Garfield", 38, "orange and black")
  val cat2: Cat = Cat("Garfield", 38, "orange and black")
  val cat3: Cat = Cat("Heathcliff", 33, "orange and black")

  implicit val catEq: Eq[Cat] = (cat1: Cat, cat2: Cat) =>
      cat1.name == cat2.name
        && cat1.age == cat2.age
        && cat1.color == cat2.color

  "CatEq" should "return true for equal cats" in:
    assert(cat1 eqv cat2)

  it should "return false for non-equal cats" in:
    assert(cat1 =!= cat3)

  it should "return true for equal cats with option" in:
    val optCat1 = Option(cat1)
    val optCat2 = Option(cat2)
    assert(optCat1 eqv optCat2)
