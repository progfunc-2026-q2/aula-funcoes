/**
 Demonstrates different ways to define and use lambda expressions in Scala.
*/
package lambdas

/**
 Shows how to define lambda expressions without explicit type annotations.
 Demonstrates identity, addition, and multiplication lambdas.
*/
def typingTheLambda() = 
    val identity = (x: Int) => x
    val add = (x: Int, y: Int) => x + y
    val multiply = (x: Int, y: Int) => x * y

    println(s"Identidade de 5: ${identity(5)}")
    println(s"Soma de 5 e 3: ${add(5, 3)}")
    println(s"Multiplicação de 5 e 3: ${multiply(5, 3)}")

/**
 Shows how to define lambda expressions with explicit type annotations on the bindings.
 Demonstrates identity, addition, and multiplication lambdas with types.
*/
def typingTheBinding() = 
    val identity: Int => Int = x => x
    val add: (Int, Int) => Int = (x, y) => x + y
    val multiply: (Int, Int) => Int = (x, y) => x * y

    println(s"Identidade de 5: ${identity(5)}")
    println(s"Soma de 5 e 3: ${add(5, 3)}")
    println(s"Multiplicação de 5 e 3: ${multiply(5, 3)}")

/**
 Prints the interfaces (traits) implemented by the lambda expressions.
 Useful for understanding how lambdas are represented at runtime.
*/
def getTraits() = {
    val identity: Int => Int = x => x
    val add: (Int, Int) => Int = (x, y) => x + y
    val multiply: (Int, Int) => Int = (x, y) => x * y

    identity.getClass.getInterfaces.foreach { i =>
        println(s"Identity interfaces: ${i.getName}")
    }
    add.getClass.getInterfaces.foreach { i =>
        println(s"Add interfaces: ${i.getName}")
    }
    multiply.getClass.getInterfaces.foreach { i =>
        println(s"Multiply interfaces: ${i.getName}")
    }
}

/**
 Main function that runs all lambda demonstrations.
*/
@main def run(): Unit = {
    typingTheLambda()
    typingTheBinding()
    getTraits()
}
