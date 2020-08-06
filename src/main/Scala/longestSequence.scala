

object longestSequence {
 def longestForward(arr:Array[Int])=
{
    var subSeqLength:Int = 1;
    var longest:Int = 1;
    var indexStart:Int = 0;
    var indexEnd:Int = 0;

    for (i <- 0 to arr.length - 2)
    {
        if (arr(i) == arr(i + 1) - 1)
        {
            subSeqLength=subSeqLength+1
            if (subSeqLength > longest)
            {
                longest = subSeqLength;
                indexStart = i + 2 - subSeqLength
                indexEnd = i + 2
            }
        } 
        else
            subSeqLength = 1
    }
    //print the sequence
    for (i <- indexStart to indexEnd - 1)
        print(arr(i) + ",");        
}
    
  def main(args: Array[String]) {
   longestForward(Array(1,2,3,2,4,5,6,7,8,1,0,4,5,6))
  }
}