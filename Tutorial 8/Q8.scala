import scala.math._

case class Point(var x:Int, var y:Int){

    def +(p:Point): Point ={
      new Point(this.x + p.x , this.y + p.y)
    }

    def move(a:Int, b:Int): Point ={
      new Point(this.x + a , this.y + b)
    }

    def distance(p:Point): Double ={
      sqrt(((this.y - p.y) * (this.y - p.y)) + ((this.x - p.x) * (this.x - p.x)))
    }

    def invert(): Point ={
      var temp = this.x
      this.x = this.y
      this.y = temp
      Point(this.x, this.y)
    }
}

object Q8 extends App{

  var p1 = Point(0,4)
  var p2 = Point(3,0)

  print("Add => ")
  println(p1.+(p2))
  print("move => ")
  println(p1.move(2,3))
  print("distance => ")
  println(p1.distance(p2))
  print("invert => ")
  println(p1.invert())
}
