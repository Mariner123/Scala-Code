

object divisible {
 
  def divi{
    
    for {
      i <- 2000 to 3200
      if i % 7 == 0 && i % 5 != 0
    }print(i +",")
  }
  
    def main(args : Array[String]){
      divi
      
  }
}