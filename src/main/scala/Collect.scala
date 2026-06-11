/**
  Demonstrates the use of the `collect` combinator in Scala.
  `collect` applies a partial function defined via pattern matching to transform
  and filter elements in a single pass.
*/
package collect

/** A list containing elements of various types. */
val mixedList: List[Any] = List("apple", 42, "banana", true, "cherry")

/**
  Uses `collect` with a partial function (defined using case clauses) to only keep
  Strings (converting them to uppercase) and Ints (doubling them), while filtering out other types.
*/
val collected = mixedList.collect {
  case s: String => s.toUpperCase
  case i: Int => i * 2
}

/** Main function that prints the original and collected lists. */
@main def run(): Unit = {
  println(s"Lista original: $mixedList")
  println(s"Lista resultante: $collected")
}