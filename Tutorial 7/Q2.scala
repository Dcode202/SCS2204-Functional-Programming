class Rational(a:Int, b:Int){
  def n = a     // numerator
  def d = b     // denominator

  def add(r: Rational) = new Rational(this.n * r.d + this.d * r.n, this.d * r.d)   // additions

  //    n     r.n             n x r.d   +   d x r.n
  //   ---  + -----   =      -----------------------
  //    d     r.d                    d x r.d

  override def toString():String ={          // overrinding it toString()
    n + "/" + d
  }
}

object Q2 extends App{

  // rational number
  val x = new Rational(3,4)
  val y = new Rational(5,8)
  val z = new Rational(2,7)

  // output
  println(x.add(y).add(z))

}
