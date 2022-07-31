object Q2 extends App{
  def patternMatching(a:Int): Unit ={
    a match{
      case x if x<=0 => println("Negative/Zero is input")
      case x if x%2==0 => println("Even number is given")
      case _ => println("Odd number is given")
    }
  }

  print("Enter Number: ")
  val a = scala.io.StdIn.readInt()
  patternMatching(a)
}
