fun main(){

    val myFamilyList = myFamily()
    println("My family members are: ${myFamilyList.joinToString()}")

    val area = MyArea(5, 6)
    println("The area is ${area.area}.")

}

fun myFamily (): List<String>{
   val famList = mutableListOf("Mother", "Father", "Sister")
    return famList
}

class MyArea (width: Int, height: Int){
    val area = width*height
}