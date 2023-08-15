

fun main(){

    val l = {print("Hello, ")}

    fun higherFunc(lmbd:()->Unit){
        lmbd()
    }

    higherFunc(l)

    val p = { println("Girl :)") }

    p()

    val secondL = {a: Int, b: Int -> a+b}

    fun secondHigherFunc(lmbd:(Int, Int)->Int){
        val result = lmbd(3,5)
        println("The sum is $result")
    }

    secondHigherFunc(secondL)

}