object Q3 extends App{
  println("Using IF-ELSE")
  def LargestNum(a:Int, b:Int, c:Int): Int ={
    if(a>b && a>c){
      return a
    }else if(b>a && b>c){
      return b
    }else{
      return c
    }
  }
  println(LargestNum(3, 10, 90))
  println(LargestNum(50,20, -3))
  println(LargestNum(2, 2, 50))

  println()
  println("Using TERNARY IF_ELSE")
  def TlargestNum(a:Int, b:Int, c:Int) = if(a>b && a>c) a else if(b>a && b>c) b else c
  println(TlargestNum(3, 10, 90))
  println(TlargestNum(50,20, -3))
  println(TlargestNum(2, 2, 50))
}
