package functiondefinition

/**
 Adds two integers and returns the result.
 Demonstrates a simple function with parameters and return value.
*/
def sum(a: Int, b: Int): Int = {
  a + b
}

/**
 Test function for sum.
 Shows how to call the sum function and print the result.
 Didactic use to illustrate function testing.
*/
def testSum(): Unit = {
  val a = 5
  val b = 3
  println(s"The sum of $a and $b is: ${sum(a, b)}")
}

/**
 Example of a nested function (function inside a function).
 Demonstrates scope and use of local functions.
 f1 calls f2 internally, passing the difference between a and b.
*/
def f1(a: Int, b: Int): Int =
  def f2(c: Int): Int =
    a + b + c
  f2(a - b)

/**
 Test function for f1.
 Shows how to use nested functions and print the result.
*/
def testF1(): Unit =
  val a = 5
  val b = 3
  println(s"The result of f1($a, $b) is: ${f1(a, b)}")

/**
 Reads two integers from the keyboard and prints the sum.
 Demonstrates how to call a function with user input.
*/
def readThenPrint(): Unit =
  val a = scala.io.StdIn.readInt()
  val b = scala.io.StdIn.readInt()
  println(s"The sum is: ${sum(a, b)}")

/**
 Test function for readThenPrint.
 Instructs the user to enter two integers.
*/
def testReadPrint(): Unit = {
  println("Enter two integers:")
  readThenPrint()
}

/**
 Returns double Pi.
 Demonstrates parentheses-less function definition.
*/
def doublePi = 2 * math.Pi

/**
 Test function for doublePi.
*/
def testDoublePi(): Unit = {
  println(s"The double of Pi is: ${doublePi}")
}

/**
 Multiplies two integers, default values are 1.
 Example of default parameters in function definition.
*/
def multiply(a: Int = 1, b: Int = 1): Int =
  a * b

/**
 Test function for multiply.
 Shows different ways to call using default parameters.
*/
def testMultiply(): Unit = {
  println(s"Default multiplication: ${multiply()}")
  println(s"Multiplication with one argument: ${multiply(5)}")
  println(s"Multiplication with two arguments: ${multiply(5, 3)}")
}

/**
 Concatenates first and last name, with a default value for the first name.
 Example of default parameters.
*/
def fullName(first: String = "Fulano", last: String): String =
  s"$first $last"

/**
 Test function for fullName.
 Shows use of named and default parameters.
*/
def testFullName(): Unit =
  println(s"Full name: ${fullName(first = "João", last = "Silva")}")
  println(s"Full name: ${fullName(last = "Silva", first = "João")}")
  println(s"Full name: ${fullName(last = "Silva")}")

/**
 Demonstrates use of variadic parameters (varargs).
*/
def doubleAll(numbers: Int*): Seq[Int] =
  numbers.map(n => n * 2)
  
/**
 Test function for doubleAll.
 Prints the doubled numbers.
*/
def testDoubleAll(): Unit = {
  println(s"Doubled numbers: ${doubleAll(1, 2, 3, 4, 5)}")
}

/**
 Main function that runs all tests.
*/
def run(): Unit = {
  testSum()
  testF1()
  // testReadPrint()
  testDoublePi()
  testMultiply()
  testFullName()
  testDoubleAll()
}

/**
 Main entry point of the program.
*/
@main def main(): Unit = run()