class Rational(a:Int, b:Int){
  def n = a     // numerator
  def d = b     // denominator

  def neg = new Rational(-this.n, this.d)     // negating
  override def toString():String ={          // overrinding it toString()
    n + "/" + d
  }
}

object Q1 extends App{

  // rational number
  val r1 = new Rational(-3,4)

  // checking if the denominator is zero
  if(r1.d == 0){
      println("Invalid Input")
      sys.exit(0)
  }

  // output
  println(r1.neg)

}
