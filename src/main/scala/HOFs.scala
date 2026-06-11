
/**
  Demonstrates Higher-Order Functions (HOFs) in Scala.
  Illustrates functions that accept other functions as arguments, return functions,
  or combine both paradigms.
*/
package hofs

/**
  A higher-order function that applies function f twice to the value x.
  f(f(x))
*/
def twice(f: Int => Int, x: Int): Int = f(f(x))

/** Demonstrates the use of the twice function. */
def runTwice =
  println(twice(x => x + 1, 5))
  println(twice(x => x * 2, 5))

/**
  Checks if functions f and g return the same result for a given input x.
*/
def isEquivalent(f: Int => Int, g: Int => Int, x: Int) =
  f(x) == g(x)

/** Demonstrates equivalence checks for different lambda functions. */
def runIsEquivalent =
  println(isEquivalent(x => x + 1, x => x * 2, 5))
  println(isEquivalent(x => x + x, x => 2 * x, 5))

/**
  Fábrica de funções (Function Factory): Returns a function that multiplies
  an integer by a fixed config factor.
*/
def multiplier(factor: Int): Int => Int =
  (x: Int) => x * factor

/** Demonstrates creating and invoking multiplier functions. */
def runMultiplier =
  println(multiplier(2)(5))
  println(multiplier(3)(5))

/**
  Translates a function f by horizontal offset dx and vertical offset dy.
  This function is a HOF in both directions: it takes a function as argument AND returns a function.
*/
def translate(f: Double => Double, dx: Double, dy: Double): (Double => Double) =
  (t: Double) => f(t - dx) + dy

/** Demonstrates the translate function. */
def runTranslate: Unit = {
  val f1 = (t: Double) => 2 * t * t + 1
  val translatedF1 = translate(f1, 1.0, 2.0)

  println(f1(3.0))
  println(translatedF1(3.0))
}

/**
  Calculates the numerical derivative of function f at x using difference quotient with step size h.
*/
def derivative(f: Double => Double, x: Int, h: Double = 10e-4): Double = {
  (f(x + h) - f(x)) / h
}

/** Demonstrates the derivative function on polynomial functions. */
def runDerivative: Unit = {
  println(derivative((x: Double) => 3 * x * 2, 3))
  println(derivative((x: Double) => 2 * x * x + 1, 3))
}

/** Main function executing select higher-order function demos. */
@main def run(): Unit = {
  runTwice
  runIsEquivalent
  runMultiplier
  runTranslate
  runDerivative
}