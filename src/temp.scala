object temp {
  def my_calculate(a:Int,b:Int,c:Int): Int ={
    var ans = a*b+c
    println(ans)
    return ans
  }
  def main(args:Array[String]): Unit ={

    var a = 10
    var b = 20
    var c = 30
    var res = my_calculate(a,b,c)
    println(res)
    println("the result = " + res)

  }

}
