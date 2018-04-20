

object CollectionOper {
  def main(args:Array[String]):Unit ={
    var list1 = List("xah","zkf","jay")
    
    //x :: list   向list的表头加入x, 等效于 list.::(x)  
    var list2 = "chou"::list1
    println(list2)
    var list3 = list1.::("chou")
    println(list3)
    var list4 = list1::list2
    println(list4)
    
    //:::用于连接两个lsit  ++ 连接两个集合（比:::更加通用，++只用于列表）
    var li1 = List("kk","dd")
    var li2 = List("qq",1)
    var li3 = li1:::li2
    println(li3)
    
    //:+ 在尾部追加元素  +:在头部追加元素；追加的元素要放在靠近+号的一侧，不然就会出现下面第二个例子
    var l1 = List("aa")
    var l2 = l1 :+ "bb"
    println(l2)
    var l3 = l1 +: "cc"
    println(l3)
    var l4 = 2 +: l1
    println(l4)
    
  }
}