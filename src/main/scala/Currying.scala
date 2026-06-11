/**
  Demonstrates currying and partial application of functions in Scala.
  Multi-parameter functions are translated into nested single-parameter functions.
*/
package currying

/**
  A curried function that sums three integers.
  Uses multiple parameter groups to achieve currying.
*/
def sum(x: Int)(y: Int)(z: Int): Int = x + y + z

/**
  A function value representation of a curried sum of three integers.
  Explicitly shows the nested lambda structure: (Int) => (Int) => (Int) => Int.
*/
val sum2 =
  (x: Int) => (y: Int) => (z: Int) => x + y + z

/**
  Demonstrates partial application using the sum function.
  Shows how fixing some parameters returns a new function with fewer parameters.
*/
def runSum =
  val add5 = sum(5)
  val add5And10 = add5(10)
  println(add5And10(20))
  println(add5And10(30))

/**
  Demonstrates partial application using the nested lambda function sum2.
*/
def runSum2 =
  val add5 = sum2(5)
  val add5And10 = add5(10)
  println(add5And10(20))

/**
  A curried function that translates (shifts) a target function f by offsets dx and dy.
  Takes configuration parameters (dx, dy) in the first groups, and the function (f) in the last group.
*/
def translate(dx: Double)(dy: Double)(f: Double => Double): Double => Double =
  (t: Double) => f(t - dx) + dy

/**
  Demonstrates partial application of the translate function.
  Shows how to lock in a specific offset translation and apply it to multiple functions.
*/
def runTranslate =
  val shiftRight1Up2 = translate(1.0)(2.0)

  val f1 = (t: Double) => 2 * t * t + 1
  val f2 = (t: Double) => 3 * t + 4

  println(f1(3.0))
  println(shiftRight1Up2(f1)(3.0))
  println(f2(3.0))
  println(shiftRight1Up2(f2)(3.0))

/**
  A curried select function that mimics a basic SQL query.
  Takes the table name in the first group, and fields in the second.
*/
def select(table: String)(fields: Seq[String]): String =
  s"SELECT ${fields.mkString(", ")} FROM $table"

/**
  Demonstrates partial application of the select function to create specialized query builders.
*/
def runSelect =
  val professor = select("professor")
  val student = select("student")
  val personalData = Seq("name", "age")
  val contactData = Seq("email", "phone")

  println(professor(personalData))
  println(professor(contactData))
  println(student(contactData ++ personalData))

/**
  Demonstrates automatic currying of a standard tuple/multi-argument lambda in Scala.
*/
def autoCurrying =
  def sum = (x: Int, y: Int) => x + y
  def curriedSum = sum.curried
  val add5 = curriedSum(
    5
  ) // Partial application fixing the first argument to 5
  println(add5(10))
  println(add5(20))

/**
  Main entry point for currying demonstrations.
*/
@main def run(): Unit =
  runSum
  runSum2
  runTranslate
  runSelect
  autoCurrying

