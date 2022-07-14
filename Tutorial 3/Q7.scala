object Q7 extends App{
  def season(month:Int): Unit ={
    if(month==12 || month==1 || month==2)
      println("Winter")
    else if(month==3 || month==4 || month==5)
      println("Spring")
    else if(month==6 || month==7 || month==8)
      println("Summer")
    else if(month==9 || month==10 || month==11)
      println("Autumn")
    else
      println("Bogus Month")
  }

  season(2)
  season(6)
  season(4)
  season(20)
  season(11)
}
