class Test { //class has no arguments
  var a: Int = 0 //variables in this class have to be initialized
  var b: Int = 0

        //println("Hello") //you cannot use println in a class body without placing it inside a member function or init block

}

fun main(){
    val myClass = Test() //initialize the class

    myClass.a = 7
    myClass.b =6

    println(myClass.a + myClass.b)

}