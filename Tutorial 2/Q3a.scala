object Q3a extends App{

  // NT 1h -> rs.250
  // OT 1h -> rs.85
  // 1 emp -> 40 NT + 30 OT -> per week
  // pays 12% tax
  // Calculate weekly take home salary of an employee

  def NormalHour(a:Float) = a * 250.0
  def OT(b:Float) = b * 85.0

  def tax(x:Float, y:Float): Double ={
    return (NormalHour(x) + OT(y))* 0.12
  }

  def salary(p:Float, q:Float): Double ={
    return NormalHour(p) + OT(q) - tax(p, q)
  }

  println("Weekly take home salary of an employee = " + salary(40, 30))
  
}
