package _2_MONOIDS_AND_SEMIGROUPS._4_Exercise_All_Set_for_Monoids

trait Semigroup[A]:
  def combine(x: A, y: A): A

trait Monoid[A] extends Semigroup[A]:
  def empty: A

object Monoid:
  def apply[A](implicit monoid: Monoid[A]): Monoid[A] =
    monoid

object SetMonoidInstances:
  given setUnionMonoid[A]: Monoid[Set[A]] with
    def combine(x: Set[A], y: Set[A]): Set[A] =
      x union y
    def empty: Set[A] =
      Set.empty[A]
