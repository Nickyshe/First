class Triangle(
    val a: Double,
    val b: Double,
    val c: Double
) {
    val x = 0.5
    init {

        println("Triangle create with $a = a $b = b $c = c")
        println("area is ${area()}")
        println("perimeter is ${perimeter()}")
    }
    fun area()= x * a * b
    fun perimeter() = a + b + c
}