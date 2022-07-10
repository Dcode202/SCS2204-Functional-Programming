object Demo{
  def main(args: Array[String]): Unit ={
    //Variables -> Q3
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    var k = 4.3f
    var g = 4.0f

    //--i or i-- doesn't work in scala => Gives an ERROR
    print("a) ")
    b = b - 1                 //since --b
    println(b * a + c * d)
    d = d - 1                 //since d--

    print("b) ")
    println(a)
    a = a + 1                 //since a++

    print("c) ")
    println(-2 * (g - k) + c)

    print("d) ")
    println(c)
    c = c + 1

    print("e) ")
    c = c + 1
    println(c * a)
    a = a + 1
  }
}
