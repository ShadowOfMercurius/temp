object temp {
  def my_calculate(a:Int,b:Int,c:Int): Int ={
    var ans = a*b+c
    println(ans)
    return ans
  }
  def my_calculate2(a:Int,b:Int): Int ={
    var ans = a*b
    return ans
  }

  def my_js(a:Int,b:Int):Int = {
    var ans = a-a+520
    return ans
  }
  def main(args:Array[String]): Unit ={

    var a = 10
    var b = 20
    var c = 30
    var res = my_calculate(a,b,c)
    var res2 = my_calculate2(res,a)
    var res3 = my_js(res2,20)
    println(res2)
    println("the result = " + res3)

  }

}
