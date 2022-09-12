object Q3 extends App{

  // accounts Map
  var accounts = scala.collection.mutable.Map(0 -> 0.0)


  //==================== creating an account ============================//
  def createAcc(id:Int, balance:Double = 0.0): Unit ={
    if(accounts.contains(id)){
      println("Account already exists")
      sys.exit(0)
    }
    accounts += (id -> balance)
  }

  //==================== deposit function ============================//
  def deposit(senId:Int, amount:Double): Unit ={
    accounts(senId) = accounts(senId) + amount
  }

  //==================== transfer function ============================//
  def transfer(senId:Int, recId:Int, amount:Double): Unit ={
    accounts(senId) = accounts(senId) - amount
    accounts(recId) = accounts(recId) + amount
    println(amount.toString + " transfered to ID" + recId.toString + " from ID" + senId.toString)
    println("Available Balance of ID" + senId.toString + " = " + accounts(senId).toString)
    println()
  }


  // processes
  createAcc(101)
  createAcc(102)
  deposit(101, 1000.0)
  transfer(101, 102, 900.0)

  println(accounts)
}
