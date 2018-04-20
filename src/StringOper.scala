

object StringOper {
  
  /*
   * String 是一个不可变的对象，其实本质是一个java String
   */
  val greeting:String = "Hello,world"
  
  def main(args:Array[String]):Unit={
      println(greeting)
      
      /*
       * StringBuilder 是一个可修改的对象
       */
      val buf = new StringBuilder;
      buf += 'a'
      buf ++= "bcdef"
      println("buf is :"+buf.toString())
      
      /*
       * 获得字符串长度
       */
      var len = buf.length();
      println(len)
      
      /*
       * 格式化输出字符串
       */
      var floatVar = 12.456
      var intVar = 12
      var strVar = "nice"
      printf("浮点型为  %f,整形变量为 %d,字符串为 %s",floatVar,intVar,strVar)
    
  }
}