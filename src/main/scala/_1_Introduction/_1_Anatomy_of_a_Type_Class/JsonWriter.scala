package _1_Introduction._1_Anatomy_of_a_Type_Class

// Define a very simple JSON AST
sealed trait Json
final case class JsObject(get: Map[String, Json]) extends Json
final case class JsString(get: String) extends Json
final case class JsNumber(get: Double) extends Json
final case object JsNull extends Json

object Json:
  def toJson[A](value: A)(using w: JsonWriter[A]): Json =
    w.write(value)

// The "serialize to JSON" behaviour is encoded in this trait
trait JsonWriter[A]:
  def write(value: A): Json
