
//
//object HelloWorld {
//  def main(args:Array[String]):Unit = {
//    println("hello,world")
//  }
//}

object HelloWorld {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
   // println("concat arguments = " + foo(args))
  }

}