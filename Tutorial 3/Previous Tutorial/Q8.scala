object Q8 extends App{
  def FtoC(temp:Float) = 5 / 9 * (temp - 32)
  def CtoF(temp:Float) = (temp * 9 / 5) + 32

  println(FtoC(32) + "C")
  println(CtoF(0) + "F")
}
