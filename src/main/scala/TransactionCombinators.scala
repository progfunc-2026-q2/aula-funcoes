/**
  Demonstrates how to build modular collection pipelines and compose them.
  Shows how smaller pipeline functions of type `List[A] => List[B]` can be
  glued together using the `andThen` function composer.
*/
package transactionCombinators

/** Represents a commercial transaction with an ID, price, and active/inactive status. */
case class Transaction(id: String, price: Double, active: Boolean)

/**
  Auditing pipeline:
  Filters out inactive transactions and applies a standard 5% tax deduction (multiplies price by 0.95).
*/
val auditPipeline: List[Transaction] => List[Transaction] =
  (ledger: List[Transaction]) =>
    ledger
      .filter(_.active)
      .map(t =>
        t.copy(price = t.price * 0.95) // adjust price
      )

/**
  Metrics pipeline:
  Filters for high-value sales (price > 100.0) and extracts their prices.
*/
val metricsPipeline: List[Transaction] => List[Double] =
  (ledger: List[Transaction]) =>
    ledger
      .filter(_.price > 100.0) // filter high value sales
      .map(_.price)

/**
  Full composed pipeline:
  First audits the transactions, then extracts metrics from the audited results.
*/
val fullPipeline: List[Transaction] => List[Double] =
  auditPipeline andThen metricsPipeline

/** Sample ledger data for demonstrating the composed pipeline. */
val ledger = List(
  Transaction("T1", 200.0, active = true),
  Transaction("T2", 50.0, active = true),
  Transaction("T3", 300.0, active = false),
  Transaction("T4", 120.0, active = true)
)

/** Main function that evaluates the pipeline and prints the final metrics list. */
@main def run =
  println(fullPipeline(ledger))

