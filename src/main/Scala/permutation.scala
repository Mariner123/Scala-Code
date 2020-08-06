

object permutation {
  def permutations(s: String): List[String] = {
    def merge(ins: String, c: Char): Seq[String] =
      for (i <- 0 to ins.length) yield
        ins.substring(0, i) + c + ins.substring(i, ins.length)

    if (s.length() == 1)
      List(s)
      
    else
      permutations(s.substring(0, s.length - 1)).flatMap { p =>
        merge(p, s.charAt(s.length - 1))
      }
  }
  def main(args: Array[String]): Unit = {
    var s:List[String]=permutations("ABC")
    for(i<-s)
    {
      println(i)
    }
  } 
}