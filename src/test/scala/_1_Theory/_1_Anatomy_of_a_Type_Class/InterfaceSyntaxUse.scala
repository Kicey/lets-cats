package _1_Theory._1_Anatomy_of_a_Type_Class

import org.scalatest.flatspec.AnyFlatSpec

class InterfaceSyntaxUse extends AnyFlatSpec:
  "Person object" should "implicitly convert to JsonSyntax object" in:
    import JsonSyntax._
    import JsonWriterInstances._
    val dave = Person("Dave", "dave@example.com").toJson
