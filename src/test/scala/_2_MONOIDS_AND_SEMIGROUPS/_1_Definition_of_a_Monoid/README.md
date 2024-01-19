* Formally, a monoid for a type A is:

  * an operation combine with type (A, A) => A
  * an element empty of type A

  In addition to providing the combine and empty operations, monoids must formally obey several laws. For all values x, y, and z, in A, combine must be associative and empty must be an identity element.

## The formal definition of monoid in math(from wiki)

A [set](https://en.wikipedia.org/wiki/Set_(mathematics)) *S* equipped with a [binary operation](https://en.wikipedia.org/wiki/Binary_operation) *S* × *S* → *S*, which we will denote •, is a **monoid** if it satisfies the following two axioms:

- Associativity

  For all *a*, *b* and *c* in *S*, the equation (*a* • *b*) • *c* = *a* • (*b* • *c*) holds.

- Identity element

  There exists an element *e* in *S* such that for every element *a* in *S*, the equalities *e* • *a* = *a* and *a* • *e* = *a* hold.

In other words, a monoid is a [semigroup](https://en.wikipedia.org/wiki/Semigroup) with an [identity element](https://en.wikipedia.org/wiki/Identity_element). It can also be thought of as a [magma](https://en.wikipedia.org/wiki/Magma_(algebra)) with associativity and identity. The identity element of a monoid is unique.[[a\]](https://en.wikipedia.org/wiki/Monoid#cite_note-1) For this reason the identity is regarded as a [constant](https://en.wikipedia.org/wiki/Constant_(mathematics)), i. e. 0-ary (or nullary) operation. The monoid therefore is characterized by specification of the [triple](https://en.wikipedia.org/wiki/Tuple) (*S*, • , *e*).

Depending on the context, the symbol for the binary operation may be omitted, so that the operation is denoted by juxtaposition; for example, the monoid axioms may be written (*ab*)*c* = *a*(*bc*) and *ea* = *ae* = *a*. This notation does not imply that it is numbers being multiplied.

A monoid in which each element has an [inverse](https://en.wikipedia.org/wiki/Inverse_element) is a [group](https://en.wikipedia.org/wiki/Group_(mathematics)).