object Q2 extends App{
  println("Using IF-ELSE")
  def LargestNum(a:Int, b:Int): Int ={
    if(a>b){
      return a
    }else{
      return b
    }
  }
  println(LargestNum(3, 10))
  println(LargestNum(50,20))
  println(LargestNum(2, 2))

  println()
  println("Using TERNARY IF_ELSE")
  def TlargestNum(a:Int, b:Int) = if(a>b) a else b
  println(TlargestNum(3, 10))
  println(TlargestNum(50,20))
  println(TlargestNum(2, 2))
}
