package _2_MONOIDS_AND_SEMIGROUPS._5_Monoids_in_Cats

import cats.Monoid
import cats.syntax.semigroup._ // for |+|

case class Order(totalCost: Double, quantity: Double)

implicit val orderMonoidInstance: Monoid[Order] =
  new Monoid[Order]:
    def combine(o1: Order, o2: Order): Order =
      Order(
        o1.totalCost + o2.totalCost,
        o1.quantity + o2.quantity
      )

    def empty: Order = Order(0, 0)

def add[A](items: List[A])(implicit monoid: Monoid[A]): A =
  items.foldLeft(monoid.empty)(_ |+| _)
