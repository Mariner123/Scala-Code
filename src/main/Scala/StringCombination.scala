import java.lang

object StringCombination {
  def strSwap(a :String,i:Int,j:Int):String={
    var charArray = a.toCharArray()
    var x = charArray(i)
    charArray(i)=charArray(j)
    charArray(j)=x
    return String.valueOf(charArray);
  }
 
  def permute(str:String,start :Int,end:Int){
   // println("start :" +start)
   // println("end :" +end)
    var b = str
    if (start == end){
      println(b)
    }
    else {
      for (i <- start to end){
       // println(i)
        b = strSwap(b,start,end)
        println(b)
        permute(str, start+1, end)
        b = strSwap(b, start, end)
      }
    }
  }
  def main(args: Array[String]) {
   val str :String = "ABC"
   val len : Int = str.length()
   permute(str,0, len-1)
   
  // strSwap(str, 0, len-1)
  }
}