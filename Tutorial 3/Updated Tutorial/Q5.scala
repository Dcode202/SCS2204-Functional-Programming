object Q5 extends App{
  // Easy pace => 8 min/km => runs 2km and again 2km
  // Tempo     => 7 min/km => runs 3km
  def easyPace(x:Double) = x * 8
  def tempo(x:Double) = x * 7
  var tot = easyPace(2)+tempo(3)+easyPace(2)
  println("Total Run = " + tot + " min")
}
