* Formally, a functor is a type F[A] with an operation map with type (A => B) => F[B].

* Functors guarantee the same semantics whether we sequence many small operations one by one, or combine them into a larger function before mapping. To ensure this is the case the following laws must hold:
  Identity: calling map with the identity function is the same as doing nothing:
  fa.map(a => a) == fa
  Composition: mapping with two functions f and g is the same as mapping with f and then mapping with g:
  fa.map(g(f(_))) == fa.map(f).map(g)
