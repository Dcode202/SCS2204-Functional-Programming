object Q4 extends App{

  def isEven(n:Int): Unit={
    if(n == 1){
      println("Odd")
    }
    else if(n == 0){
      println("Even")
    }
    else if(n < 0){
      isEven(-n)  //if it's a negative number
    }
    else{
      isEven(n-2)
    }
  }

//test cases
  isEven(2)
  isEven(3)
  isEven(9)
}
