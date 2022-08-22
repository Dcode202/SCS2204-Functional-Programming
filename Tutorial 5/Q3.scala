object Q3 extends App{

  var tot = 0 //Initial Sum

  def sum(n:Int): Unit = {
    if(n > 0){
      tot = tot + n
      return sum(n-1)
    }
    else{
      println(tot)
      tot = 0
    }
  }

//test cases
  sum(5)
  sum(10)

}
