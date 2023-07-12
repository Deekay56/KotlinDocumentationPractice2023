/*

class MyEmployee(private val fName: String, val lName: String, val yearsWorked: Int, val yearBorn: Int){
    //declaration of properties of a class needs to ALWAYS be in the class, not inside an init block or member function
    val empFullName = "$fName $lName"
    val empAge: Int
    val currentYear = 2023

    init {
        empAge = currentYear - yearBorn
    }

    //you can also use functions inside a class, called member functions
    fun allTheBest(): String{
        return "All the best to $empFullName!"
    }

}//end class


fun main (){

  val customEmployee1 = MyEmployee("John", "Kerry", 2, 1998)

    println("${customEmployee1.fName} ${customEmployee1.lName} has worked for ${customEmployee1.yearsWorked} years, and was born in ${customEmployee1.yearBorn}.")

    val firstName = customEmployee1.fName

    println(firstName)

}

*/