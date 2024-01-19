package _1_Introduction._6_Controlling_Instance_Selection

sealed trait A
final case object B extends A
final case object C extends A

trait Printer[-T]:
  def print(t: T): Unit

object PrinterInstances:

  implicit val aPrinter: Printer[A] = (t: A) => println(s"a printer print $t")

  implicit val bPrinter: Printer[B.type] = (t: B.type) => println(s"b printer print $t")

// implicit val cPrinter: Printer[C.type] = (t: C.type) => println(s"c printer print $t")

object PrinterUse:
  def print[T](t: T)(using printer: Printer[T]): Unit =
    printer.print(t)
