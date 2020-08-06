

object demo {
  def f() ={ println("hello world")
  }
  def two_for_one (x: String):Unit= {
    if (x != null){
      println ("One for" +x +" One for me")
    }else{
      println("One for you, one for me")
    }
  }
  
  def main(args: Array[String]) {
   //f()
    two_for_one(" ")
  }
}