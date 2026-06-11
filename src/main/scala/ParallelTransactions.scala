/**
  Demonstrates transparent parallelization of collection combinators in Scala.
  By calling `.par` on a collection, subsequent operations (filter, map, reduce)
  are executed in parallel across multiple CPU cores.
*/
package parallelTransactions

import scala.collection.parallel.CollectionConverters._

/** Represents a commercial transaction with an ID, product category, and price. */
case class Transaction(id: String, category: String, price: Double)

/** A ledger containing a sequence of transactions. */
val ledger = List(
  Transaction("T1", "Electronics", 1200.00),
  Transaction("T2", "Books", 25.50),
  Transaction("T3", "Electronics", 150.00),
  Transaction("T4", "Electronics", 650.00),
  Transaction("T5", "Clothing", 80.00)
)

/**
  Calculates the total revenue from premium Electronics (price > 500) in parallel.
  Uses `.par` to parallelize filtering, mapping, and reduction.
*/
val electronicsRevenue = ledger.par
  .filter(_.category == "Electronics")
  .filter(_.price > 500.00)
  .map(_.price)
  .reduce(_ + _)

/** Main entry point that prints the parallel processing result. */
@main def run(): Unit =
  println(s"Total Premium Revenue: $$${electronicsRevenue}")

