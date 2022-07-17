object Q4 extends App{
  def price(x:Double): Double = {
    var total = x * 24.95
    var discount = total * 0.4
    var shipping = 0.0
    if(x>50)
      shipping = 50.0 * 3.0 + 0.75 * (x - 50)
    else
      shipping = x * 3.0
    total = total - discount + shipping
    return total
  }

  println("Total Expense = Rs." + price(60))
}
