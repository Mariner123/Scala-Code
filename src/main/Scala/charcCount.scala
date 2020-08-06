package scala;


object charcCount {
  def main(args: Array[String]) {
    val map = scala.collection.mutable.Map[Char,Int]()
      
      var str="aarnabbccffe"
      var dupCount=0
      var sinCount=0
      for(strIn <- str)
      {
        map+=(strIn -> str.count(str =>str == strIn))//map+=(strIn -> str.count(_ == strIn))
        
      }
     for(i <-map.values)
     {
       if(i>1)
         dupCount+=1
       else
         sinCount+=1
         
     }
      println("Duplicate Count",dupCount)
      println("Single Count",sinCount)
  }
}