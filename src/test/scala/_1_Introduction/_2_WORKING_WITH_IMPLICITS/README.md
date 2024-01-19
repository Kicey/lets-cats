* The places where the compiler searches for candidate instances is known as the implicit scope. The implicit scope applies at the call site; that is the point where we call a method with an implicit parameter. The implicit scope which roughly consists of:
  * local or inherited definitions(tagged with the implicit keyword);
  * imported definitions;
  * definitions in the companion object of the type class or the parameter type (in this case JsonWriter or String).