object Q5 extends App{

  var tot = 0 //initial sum

  def evenSum(n:Int): Unit={
    if(n > 0){
      if(n == 1){
        println(tot)
      }
      else if((n)%2 == 0){
        tot = tot + n
      }
      evenSum(n-1)
    }

  }

  var num = 10
  evenSum(num-1)
}
