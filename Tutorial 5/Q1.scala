object Q1 extends App{
  def prime(n:Int, i:Int=2):Boolean = {
    //checking if it is a natural number greater than 1
    if(n <= 1){
      return false
    }

    //when i = 2 or reached n
    if(n == i){
      return true
    }
    //if it has divisors other than 1 and itself
    else if(n%i == 0){
      return false
    }
    //recursion
    else{
      return prime(n, i+1)
    }

  }

  //test cases
  println(prime(5))
  println(prime(8))
  println(prime(1))
  println(prime(-5))
  println(prime(11))
}
