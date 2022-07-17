object Q6 extends App{
  /*================================== (a) ==================================*/
  def avg1(a:Float, b:Float, c:Float) = {
      var avg = (a + b + c) / 3
      if(avg < 0)
        println("Invalid Marks")
      else if(avg <= 39.0)
        println("Fail")
      else if(avg <= 54.0)
        println("Pass")
      else if(avg <= 69.0)
        println("Good")
      else
        println("Very Good")
  }
  avg1(10, 50, 30)
  avg1(-8, -50, 40)
  avg1(80, 90, 75)

  /*================================== (b) ==================================*/
  println()
  def avg2(a:Float, b:Float, c:Float) = {
      var avg = (a + b + c) / 3
      if(avg <= 69.0)
        if(avg <= 54.0)
          if(avg <= 39.0)
            if(avg < 0)
              println("Invalid Marks")
            else
              println("Fail")
          else
            println("Pass")
        else
          println("Good")
      else
        println("Very Good")
  }
  avg2(10, 50, 30)
  avg2(-8, -50, 40)
  avg2(80, 90, 75)

  /*================================== (c) ==================================*/
  println()
  def avg3(a:Float, b:Float, c:Float) = if((a + b + c) / 3 > 69.0) "Very Good" else if((a + b + c) / 3 > 54.0) "Good" else if((a + b + c) / 3 > 39.0) "Pass" else if((a + b + c) / 3 >= 0) "Fail" else "Invalid Marks"

    println(avg3(10, 50, 30))
    println(avg3(-8, -50, 40))
    println(avg3(80, 90, 75))
}
