package _2_MONOIDS_AND_SEMIGROUPS._3_Exercise_The_Truth_About_Monoids

trait Semigroup[A]:
  def combine(x: A, y: A): A

trait Monoid[A] extends Semigroup[A]:
  def empty: A

object Monoid:
  def apply[A](implicit monoid: Monoid[A]): Monoid[A] =
    monoid

object BooleanMonoidInstances:
  implicit val booleanAndMonoid: Monoid[Boolean] =
    new Monoid[Boolean]:
      def combine(a: Boolean, b: Boolean): Boolean = a && b
      def empty = true
    
  implicit val booleanOrMonoid: Monoid[Boolean] =
    new Monoid[Boolean]:
      def combine(a: Boolean, b: Boolean): Boolean = a || b
      def empty = false
      
  implicit val booleanEitherMonoid: Monoid[Boolean] =
    new Monoid[Boolean]:
      def combine(a: Boolean, b: Boolean): Boolean = (a && !b) || (!a && b)
      def empty = false

  implicit val booleanXnorMonoid: Monoid[Boolean] =
    new Monoid[Boolean]:
      def combine(a: Boolean, b: Boolean): Boolean =
        (!a || b) && (a || !b)
      def empty = true
