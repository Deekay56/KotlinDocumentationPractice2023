enum class Car(val yearMade: Int, val topSpeed: Int){
    SUBARUXR(1997, 235),
    TOYOTA24(1986, 156),
    PAGODAB23(2009, 350)

}

fun main (){
    val myCar = Car.SUBARUXR

    val carName = myCar.name
    val carIndex = myCar.ordinal
    val carYearMade = myCar.yearMade
    val carTopSpeed = myCar.topSpeed

    println("Car No.$carIndex is called $carName. First made in $carYearMade, it can reach a top speed of $carTopSpeed.")
}