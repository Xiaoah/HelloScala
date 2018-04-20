

object ArrayOper {
  
  /*
   * 声明数组
   */
  var z:Array[String] = new Array[String](3)
  //或： var z = new Array[String](3)
  
  z(0) = "xah"
  
  def main(args:Array[String]):Unit={
    var myList = Array(1,2,3,4)
    /*
     * 输出所有数组元素
     */
    for(x <- myList){
      println(x)
    }
    
    /*
     * 二维数组
     */
    var myMatrix = Array.ofDim[Int](3,3)
    for(i<- 0 to 2){
      for(j <- 0 to 2){
        myMatrix(i)(j) = j;
      }
    }
    for(i <- 0 to 2){
      for(j <- 0 to 2){
        print(" "+myMatrix(i)(j))
      }
      println()
    }
   
    /*
     * 数组合并
     */
    var myList1 = Array(1,2,3)
    var myList2 = Array(4,5,6)
    var myList3 = Array.concat(myList1,myList2)
    for(x<- myList3){
      println(x)
    }
  }
}