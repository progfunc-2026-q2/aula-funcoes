/**
  Demonstrates sequential processing of collection data in Scala.
  Uses the standard combinators `filter`, `map`, and `reduce` in a fluent style
  to calculate target statistics from transaction data.
*/
package transactions

/** Represents a commercial transaction with an ID, product category, and price. */
case class Transaction(id: String, category: String, price: Double)

/** A ledger containing a sequence of transactions. */
val ledger = List(
  Transaction("T1", "Electronics", 1200.00),
  Transaction("T2", "Books",        25.50),
  Transaction("T3", "Electronics",  150.00),
  Transaction("T4", "Electronics",  650.00),
  Transaction("T5", "Clothing",     80.00)
)

/**
  Calculates the total revenue from premium Electronics (price > 500) sequentially.
  1. filter: Keeps only "Electronics" category.
  2. filter: Keeps only products priced above 500.00.
  3. map: Extracts the price of each remaining transaction.
  4. reduce: Sums the prices.
*/
val electronicsRevenue = ledger
  .filter(_.category == "Electronics") 
  .filter(_.price > 500.00)           
  .map(_.price)                       
  .reduce(_ + _)                      

/** Main entry point that prints the calculated revenue. */
@main def run(): Unit =
    println(s"Total Premium Revenue: $$${electronicsRevenue}")

