object Q6 extends App{

  def fib(n:Int): Int ={
    if(n == 0){
      return 0
    }
    else if(n == 1){
      return 1
    }
    else{
      return fib(n-1) + fib(n-2)
    }
  }

  def fibSeq(n:Int): Unit ={
    if(n >= 0){
      fibSeq(n-1)
      print(fib(n) + " ")
    }
  }

  var value = 5
  fibSeq(value-1)
  println()

}
