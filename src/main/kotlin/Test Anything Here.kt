//Look at this class below.

//We know that class constructors contain properties which need to use the val/var keywords in order to be accessed as properties within the class or outside
//The class below shows a few modifications to show how Kotlin handles data

//One can see that fName, lName, and yearBorn do not have val/var keywords
//This means that unlike typical class properties in the constructor, they are not accessed outside the class directly, making them local variables.
//They are only used to initialize the "empFullName" property but are not stored as separate properties themselves.
//This is in contrast to the yearsWorked, which is directly accessed as a property in the main function after the class has been instantiated.

//Also note currentYear is set as PRIVATE.
//Class properties that have been set to "private" demonstrate the use of data encapsulation in Kotlin.
//Encapsulation is an object-oriented programming principle that aims to bundle data and the methods that operate on that data together into a class.
//One aspect of encapsulation is controlling access to the data members of a class.
//By making currentYear private, one is able you restrict direct access to these properties from outside the class.
//This allows you to have better control over how these properties are accessed and modified.
//When a property is private, it can only be accessed within the class itself.
//In this class code, since you are not directly accessing this property outside the class, you can make them private to enforce encapsulation and prevent unintended modification.


class MyEmployee(fName: String, lName: String, val yearsWorked: Int, yearBorn: Int){
    //declaration of properties of a class needs to ALWAYS be in the class, not inside an init block or member function
    val empFullName = "$fName $lName"
    val empAge: Int
    private val currentYear = 2023

    //the init block
    // since the primary constructor has no code other than properties and their data types
    // we use an initializer block to make use of more logic from the properties

    init {
        empAge = currentYear - yearBorn
    }

    //you can also use functions inside a class, called member functions
    fun allTheBest(): String{
        return "All the best to $empFullName!"
    }

}//end class


fun main (){

    //instantiate the MyEmployee class

    val projectManager = MyEmployee("Erica", "Bloom", 30, 1956)

    println("Our latest member of the board is ${projectManager.empFullName}. She is ${projectManager.empAge} years old," +
            " and has been working for the company for ${projectManager.yearsWorked} years. ${projectManager.allTheBest()}")


}

