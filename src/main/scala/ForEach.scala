package foreach

/**
 * Demonstrate the use of `foreach` to iterate over a list of numbers
 * and print each number.
 * 
 * This structure should be avoided, because it generates side effects.
 */
val numbers = List(1, 2, 3, 4, 5)

def printNumbers(): Unit = {
  numbers.foreach(n => println(s"Número: $n"))
}

@main def run(): Unit = {
    println(s"Números originais: $numbers")
    printNumbers()
}