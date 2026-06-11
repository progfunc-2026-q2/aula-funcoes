/**
 Demonstrates filtering elements from a list using different predicates in Scala.
*/
package filter

/**
 List of integers to be filtered in various ways.
*/
val numbers = List(1, 2, 3, 4, 5)

/**
 List containing only the even numbers from 'numbers'.
*/
val evenNumbers = numbers.filter(n => n % 2 == 0)

/**
 List containing only the odd numbers from 'numbers'.
*/
val oddNumbers = numbers.filterNot(n => n % 2 == 0)

/**
 List containing numbers greater than five from 'numbers'.
*/
val greaterThanFive = numbers.filter(n => n > 5)

/**
 Main function that prints the original list and the filtered results.
*/
@main def run(): Unit = {
  println(s"Números originais: $numbers")
  println(s"Números pares: $evenNumbers")
  println(s"Números ímpares: $oddNumbers")
  println(s"Números maiores que cinco: $greaterThanFive")
}