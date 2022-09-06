object T6 extends App{

  var alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  val E = (c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)+key)%a.size)

  def decrypt(char:Char, key:Int, a:String):Char = {

      var index = a.indexOf(char.toUpper);

      if (index - key < 0) {
          return a(25 - (((25 - index) + key) % a.size));
      }
      else {
          return a(index - key);
      }

  }


  val cipher=(algo:(Char,Int,String)=> Char,s:String,key:Int,a:String)=>
  s.map(algo(_,key,a))

  var s = "applez"

  val ct=cipher(E,s,1,alphabet)
  println(ct)

  val pt=cipher(decrypt,ct,1,alphabet)
  println(pt)

}
