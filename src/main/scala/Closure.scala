/** Demonstrates closures and lexical scope in Scala. Illustrates how a function
  * can capture variables from its surrounding lexical environment and access
  * them even after the outer function has completed execution.
  */
package closures

/** A function f that returns an inner anonymous function. The returned function
  * captures the parameter `x` and the local variable `y` from the outer lexical
  * scope.
  */
def f(x: Int) = {
  val y = 2
  (z: Int) => x + y + z
}

/** Main entry point displaying closure execution and state capture. */
@main def run() = {
  val c = f(3) // c is a closure capturing x=3 and y=2
  val result = c(4) // Evaluates 3 + 2 + 4 = 9
  println(s"Result of the closure: $result") // Should print 9
}
