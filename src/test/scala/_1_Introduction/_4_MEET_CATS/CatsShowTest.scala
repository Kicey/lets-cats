package _1_Introduction._4_MEET_CATS

import org.scalatest.flatspec.AnyFlatSpec

class CatsShowTest extends AnyFlatSpec:
  "showInt.show(123)" should "create string '123'" in:
    val intAsString = showInt.show(123)
    assert(intAsString == "123")

  "showString.show('abc')" should "create string 'abc'" in:
    val stringAsString = showString.show("abc")
    assert(stringAsString == "abc")

  "123.show" should "create string '123'" in:
    import cats.syntax.show._
    val intAsString = 123.show
    assert(intAsString == "123")

  "abc.show" should "create string 'abc'" in:
    import cats.syntax.show._
    val stringAsString = "abc".show
    assert(stringAsString == "abc")
