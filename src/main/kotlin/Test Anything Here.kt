
fun main(){

    //an array list is used to create a dynamic array
    //this means that we can increase or decrease the size of the array as pre-requisites
    //it also offers mutability features
    //it may contain duplicates and is also not synchronized in nature

    val myColorList = arrayListOf<String>()

    myColorList.add("blue")
    myColorList.add("red")

    println("$myColorList ")

    myColorList.add(0,"green") //green takes the first position index zero, replacing blue

    println("$myColorList ")

    //you can also add a whole array list to another one. we shall use the one above
    //note that for this, we use the addAll function

    val myOtherColorList = arrayListOf<String>()

    myOtherColorList.addAll(myColorList)

    println("$myOtherColorList ")

    //to remove the brackets when printing an array list, or any collection for that matter, we can use a for loop

    for (customArrayListLooper in myOtherColorList){
        print("$customArrayListLooper ")
    }

    println()

    //to access an element in an array list, use the same syntax as in other collections
    myOtherColorList[1]

    //to change the value of an element in an array list
    myOtherColorList[0] = "purple"

    //now purple replaces green when the array list is printed out
    println("$myOtherColorList ")

    //to get the index position of an element
    println(myOtherColorList.indexOf("red"))

}