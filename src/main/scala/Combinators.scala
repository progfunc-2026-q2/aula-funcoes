/**
  Demonstrates how to orchestrate/chain multiple collection combinators (map, filter, reduce)
  to process list data in a declarative and functional pipeline.
*/
package combinators

/** Original list of integers to process. */
val numbers = List(1, 2, 3, 4, 5)

/**
  Pipelined transformation:
  1. map: Doubles each element in the list.
  2. filter: Retains only elements that are multiples of 3.
  3. reduce: Sums all remaining elements together.
*/
val result = numbers
  .map(_ * 2)
  .filter(_ % 3 == 0)
  .reduce(_ + _)

/** Main function that prints the inputs and final pipeline result. */
@main def runResult(): Unit =
  println(s"Números originais: $numbers")
  println(s"Resultado: $result")