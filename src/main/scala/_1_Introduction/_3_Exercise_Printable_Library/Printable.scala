package _1_Introduction._3_Exercise_Printable_Library

trait Printable[A]:
  def format(value: A): String

object PrintableInstances:
  given Printable[String] with
    def format(value: String): String = value

  given Printable[Int] with
    def format(value: Int): String = value.toString

object Printable:
  def format[A](value: A)(using p: Printable[A]): String = p.format(value)
  def print[A](value: A)(using p: Printable[A]): Unit = println(format(value))