package _1_Theory._3_Exercise_Printable_Library

object PrintableSyntax:
  extension [A](a: A)
    def format(using p: Printable[A]): String = p.format(a)

  extension [A](a: A)
    def print(using p: Printable[A]): Unit = println(p.format(a))
