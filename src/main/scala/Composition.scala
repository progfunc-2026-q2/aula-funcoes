/**
  Demonstrates basic function composition in Scala using the `andThen` and `compose` combinators.
  Illustrates both linear (left-to-right) and mathematical (right-to-left) evaluation orders.
*/
package composition

/** First function: adds 2 to an integer. */
val f: Int => Int = (x: Int) => x + 2

/** Second function: multiplies an integer by 3. */
val g: Int => Int = (x: Int) => x * 3

/**
  Linear composition (left-to-right): f is applied first, then g.
  Equivalent to g(f(x)). For x=5, results in: g(f(5)) = g(7) = 21.
*/
val fAndThenG = f andThen g

/**
  Mathematical composition (right-to-left): g is applied first, then f.
  Equivalent to f(g(x)). For x=5, results in: f(g(5)) = f(15) = 17.
*/
val fComposeG = f compose g

/** Method that adds 2 to an integer. */
def somarDois(x: Int): Int = x + 2

/** Method that multiplies an integer by 3. */
def triplicar(x: Int): Int = x * 3

/**
  Demonstrates composition of methods (def) using Automatic Eta-Expansion in Scala 3,
  which automatically converts methods to function objects when composing.
*/
val pipelineMetodos: Int => Int = somarDois andThen triplicar

/** Main entry point for composition demonstrations. */
@main def run() =
  println(fAndThenG(5))
  println(fComposeG(5))
  println(pipelineMetodos(5))

