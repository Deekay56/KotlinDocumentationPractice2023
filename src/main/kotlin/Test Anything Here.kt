

fun main(){
    val myName = {
        println("MyName")
    }

    myName.invoke()

    val calcSum = {a:Int, b:Int->a+b}

    calcSum(3,5)

    println(calcSum)
}