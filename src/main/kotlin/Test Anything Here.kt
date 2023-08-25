fun main(){

    //test1

    //example 1 of a mutable map

    val personToAge = mutableMapOf("Reggie" to 23, "Mark" to 43, "Sarah" to 36)

    //add a key-value pair to the map
    personToAge["Alice"] = 45

    println("$personToAge ")

    //remove a key-value pair from the map, this is done using only the key
    personToAge.remove("Reggie")

    println("$personToAge ")

    //check map size //can also use the count() function
    println(personToAge.size)

    //create a new empty map that holds both strings and numbers
    val employeeToAge = mutableMapOf<String, Int>()

    employeeToAge["Jake"] = 23
    employeeToAge["Mercy"] = 25
    employeeToAge["Sam"] = 22

    println(employeeToAge)

    //get the value of a single key

    println("The age of Sam is "+employeeToAge.getValue("Sam"))

    //or

    println("The age of Sam is "+employeeToAge["Sam"])

    //check if a key or value is contained in the map

    println(employeeToAge.containsKey("Jake")) //true
    println(employeeToAge.containsValue(64)) //false

    //traverse the hash map keys only
    for(hashMapKey in employeeToAge.keys){
        print("$hashMapKey ")
    }


    println()


}
