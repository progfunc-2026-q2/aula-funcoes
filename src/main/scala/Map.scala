/**
 Demonstrates the use of the map function to transform elements in a list in Scala.
*/
package map

/**
 List of integers to be transformed.
*/
val numbers = List(1, 2, 3, 4, 5)

/**
 List containing each element of 'numbers' doubled.
*/
val doubled = numbers.map(n => n * 2)

/**
 List containing each element of 'numbers' squared.
*/
val squared = numbers.map(n => n * n)

/**
 Main function that prints the original list, the doubled list, and the squared list.
*/
@main def run(): Unit = {
  println(s"Números originais: $numbers")
  println(s"Números dobrados: $doubled")
  println(s"Números ao quadrado: $squared")
}