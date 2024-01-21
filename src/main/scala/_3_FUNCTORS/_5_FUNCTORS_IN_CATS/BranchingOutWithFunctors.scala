package _3_FUNCTORS._5_FUNCTORS_IN_CATS

import cats.Functor

sealed trait Tree[+A]

final case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]

final case class Leaf[A](value: A) extends Tree[A]

implicit val treeFunctor: Functor[Tree] = new Functor[Tree]:
  def map[A, B](tree: Tree[A])(func: A => B): Tree[B] = tree match
    case Branch(left, right) => Branch(map(left)(func), map(right)(func))
    case Leaf(value) => Leaf(func(value))
