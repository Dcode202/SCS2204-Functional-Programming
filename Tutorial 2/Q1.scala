object Demo{
  def main(args: Array[String]): Unit ={
    //Variables -> Q1 & Q2
    var k, i, j = 2
    var m, n = 5
    var f = 12.0f
    var g = 4.0f
    var c = 'X'

    //Q3
    print("a) ")
    println(k+12*m)

    print("b) ")
    println(m/j)

    print("c) ")
    println(n%j)

    print("d) ")
    println(m/j *j)

    print("e) ")
    println(f+10*5 +g)

    print("f) ")
    // println(++i * n)     //++i doesn't work in scala => Gives an ERROR
    i = i + 1
    println(i*n)

  }
}
