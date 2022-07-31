object Q1 extends App{
  def interest(deposit:Double): Double ={
    var amount = 0.0
    if(deposit<=20000){
      amount = deposit * 0.02
    }
    else if(deposit<=200000){
      amount = deposit * 0.04
    }
    else if(deposit<=2000000){
      amount = deposit * 0.035
    }
    else if(deposit>2000000){
      amount = deposit * 0.065
    }
    return amount
  }
  print("Interest earned = Rs." + interest(45000))
}
