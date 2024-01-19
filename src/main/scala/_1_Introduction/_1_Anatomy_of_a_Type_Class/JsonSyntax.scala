package _1_Introduction._1_Anatomy_of_a_Type_Class

object JsonSyntax:
  implicit class JsonWriterOps[A](value: A) :
    def toJson(implicit w: JsonWriter[A]): Json =
      w.write(value)
