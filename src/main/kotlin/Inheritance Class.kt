//1. First Inheritance Class

open class Superclass { //a class that is being inherited from is called a super class or parent class and is labelled as "open"
                        //its methods can be inherited by other classes if there is need to, with the ":" sign

    fun method1(){
        println("This is the a method of the superclass. ")
    }

    fun method2(){
        println("This is another method of the superclass.")
    }
}

class Subclass (var name: String = ""): Superclass(){ //the subclass inherits from the superclass with the : sign
                                                     // if the superclass had any parameters, these should also be indicated, as with the example below this one

    fun method3(){
        println("This is a method of the subclass. This subclass inherits from superclass.")
    }
}
//2. Second Inheritance Class

open class Diseases (var name: String){

    fun communicableDiseases(){
        println("One of the common communicable diseases is $name.") //AIDS
    }

}

class Viruses(name: String, private var virusName: String) : Diseases(name) {

    fun virusForDisease(){
        println("$name is caused by $virusName.")
    }
}


fun main(){
    val subclassParameter = Subclass("This is a parameter of the subclass.")

    subclassParameter.method1()
    subclassParameter.method2()
    subclassParameter.method3()
    println(subclassParameter.name)

    ////////////////////////////////////////////////////////////////////////////////////

    val diseaseCause = Viruses("AIDS", "HIV")

    diseaseCause.communicableDiseases()
    diseaseCause.virusForDisease()



}