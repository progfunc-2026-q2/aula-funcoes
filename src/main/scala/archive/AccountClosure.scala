/**
  Demonstration of simulating object-oriented encapsulation and stateful objects
  using closures and mutable lexical state in Scala.
  (This example is commented out as an optional/extra classroom resource).
*/
// package accountclosure

// def account(initialBalance: Double) = {
//   var balance = initialBalance

//   (method: String) => {
//     if (method == "getBalance") {
//       () => initialBalance
//     } else if (method == "deposit") {
//       (amount: Double) => {
//         balance += amount
//       }
//     } else if (method == "withdraw") {
//       (amount: Double) => {
//         balance -= amount
//       }
//     } else {
//       throw new IllegalArgumentException("Unknown method")
//     }
//   }
// }

// @main def run() = {
//   val myAccount = account(100.0)

//   val getBalance = myAccount("getBalance")
//   println(s"Initial balance: ${getBalance}")

//   val deposit = myAccount("deposit")
//   deposit(50.0)
//   println(s"Balance after deposit: ${getBalance()}")

//   val withdraw = myAccount("withdraw")
//   withdraw(30.0)
//   println(s"Balance after withdrawal: ${getBalance()}")
// }

