package composeCombinators

case class Transaction(id: String, category: String, price: Double)


val filterElectronics: List[Transaction] => List[Transaction] =
  (list: List[Transaction]) => list.filter(_.category == "Electronics")

val filterClothing: List[Transaction] => List[Transaction] =
  (list: List[Transaction]) => list.filter(_.category == "Clothing")

val extractBasePrices: List[Transaction] => List[Double] =
    (list: List[Transaction]) => 
        list.map(t => t.copy(price=t.price * 0.7)).map(_.price)

val filterPremiumGrossPrices: List[Double] => List[Double] =
  (list: List[Double]) => list.filter(_ > 500.00)

val computeTotalRevenue: List[Double] => Double =
  (prices: List[Double]) => prices.reduce(_ + _)

val totalPremiumElectronicsRevenue: List[Transaction] => Double =
  filterElectronics andThen extractBasePrices andThen filterPremiumGrossPrices andThen computeTotalRevenue

val totalClothingRevenue: List[Transaction] => Double =
  filterClothing andThen extractBasePrices andThen computeTotalRevenue

@main def run(): Unit =
  val ledger = List(
    Transaction("T1", "Electronics", 1200.00),
    Transaction("T2", "Books", 25.50),
    Transaction("T3", "Electronics", 150.00),
    Transaction("T4", "Electronics", 650.00),
    Transaction("T5", "Clothing", 80.00),
    Transaction("T6", "Clothing", 120.00)
  )

  println(s"Total Premium Revenue: $$${totalPremiumElectronicsRevenue(ledger)}")
  println(s"Total Clothing Revenue: $$${totalClothingRevenue(ledger)}")
