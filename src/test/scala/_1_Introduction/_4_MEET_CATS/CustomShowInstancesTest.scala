package _1_Introduction._4_MEET_CATS

import org.scalatest.flatspec.AnyFlatSpec

class CustomShowInstancesTest extends AnyFlatSpec:

  "new Date().show" should "return a string representation of the date" in:
    import java.util.Date
    import _1_Introduction._4_MEET_CATS.dateShow
    import cats.syntax.show._

    val date = new Date()
    assert(date.show == s"${date.getTime.toString}ms since the epoch.")
