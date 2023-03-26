class Circle(
    val rad: Double
) {
    val pi = 3.1412
    init{
        println("circle created with radius = $rad")
        println("circle area is ${area()}")
        println("perimeter area is ${perimeter()}")
    }
    fun area()= rad * rad * pi
    fun perimeter()= 2 *rad * pi
}