object Q2 extends App{
  def prime(n:Int, i:Int=2):Boolean = {
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

  def primeSeq(n:Int): Unit={
    //Only Accepting natural numbers greater than 1
    if(n > 1){
      if(prime(n-1)){
        print(n-1 + " ")
      }
      primeSeq(n-1)
    }
  }

  primeSeq(11)

}
