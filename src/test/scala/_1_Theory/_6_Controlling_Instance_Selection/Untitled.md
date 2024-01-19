* Covariance:
  Covariance means that the type F[B] is a subtype of the type F[A] if B is a subtype of A. This is useful for modelling many types, including collections like List and Option:

  ```scala
  trait List[+A]
  trait Option[+A]
  ```

* Contravariance:
  Perhaps confusingly, contravariance means that the type F[B] is a subtype of F[A] if A is a subtype of B.This is useful for modelling types that represent inputs, like our JsonWriter type class above:

  ```scala
  trait JsonWriter[-A] {
  def write(value: A): Json
  }
  ```

* Invariance:
  This means the types F[A] and F[B] are never subtypes of one another, no matter what the relationship between A and B. This is the default semantics for Scala type constructors.



* Pay Attention: The two issues arisen in this section can be achieved in scala3, see the test in the same folder.