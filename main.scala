object main {
  def main(args:Array[String]):Unit = {
    println("----------------Adts----------------")
    println(Adts.testGetNth(List(1,2,3,4,5,6,7,8,9,10),5))
    println(Adts.testDouble(Some(5)))
    println( Adts.testIsEven(9))
    println(Adts.testSafeDivide(10,0))
    println( Adts.testGoodOldJava(_.toInt, "123"))

    println("----------------Maps----------------")
    println(Maps.testGroupUsers(Seq(Maps.User("Adam", 40) , Maps.User("Marina", 39), Maps.User("Mike", 23), Maps.User("Ivan", 21))))
    println(Maps.testNumberFrodos {
      Map("First User" -> Maps.User("Adam", 40), "Second User" -> Maps.User("Marina", 39), "Third User" -> Maps.User("Mike", 23), "Fourth User" -> Maps.User("Ivan", 21))
    })
    println(Maps.testUnderaged {
      Map("First User" -> Maps.User("Adam", 40), "Second User" -> Maps.User("Marina", 39), "Third User" -> Maps.User("Mike", 23), "Fourth User" -> Maps.User("Ivan", 21))
    })
    println("----------------Sequence----------------")
    println(Sequence.testLastElement(Seq(1,2,3,4,5,6)))
    println(Sequence.testZip(Seq(1,2), Seq(3,4)))
    println(Sequence.testForAll(Seq(1,2,3,4,5,6))( _ >= 3))
    println(Sequence.testPalindrom(Seq(1,2,3,2,1)))
    println(Sequence.testFlatMap(Seq(1,2,3,4,5,6))(value => Seq(value * 2)))

    println("----------------String----------------")
    println(Strings.testUppercase("hello"))
    println(Strings.testInterpolations("Marina", 20))
    println(Strings.testComputation(1,2))
    println(Strings.testTakeTwo("Me"))
  }
}
