package _1_Theory._1_Anatomy_of_a_Type_Class

import org.scalatest.flatspec.AnyFlatSpec

class InterfaceObjectUse extends AnyFlatSpec:
  "Json.toJson" should "implicitly using personWriter" in :
    import JsonWriterInstances._
    val dave = Json.toJson(Person("Dave", "dave@example.com"))
    assert(
      dave ==
        JsObject(
          Map(
            "name" -> JsString("Dave"),
            "email" -> JsString("dave@example.com")
          )
        )
    )
