class Age (var myAge: Int, var name: String){

    //myAge = 6 //you cannot assign a value to a class property inside the class body, but you can do so inside a function or constructor.


}

fun main() {
    val age = Age(7, "David")

    println("The age is ${age.myAge} and the name is ${age.name}.")

    val triple = Triple(6, 7, 6)

    print(triple.first)

    val secondTriple = Triple(5,"Eat", 67)

    println("${secondTriple.first}, then ${secondTriple.second}, and lastly ${secondTriple.third}.")


}

