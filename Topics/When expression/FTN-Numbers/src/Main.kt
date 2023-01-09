fun main() {
    // put your code here
    val fibonacci = listOf(0, 1, 2, 3, 5, 8, 13, 21, 34, 55)
    val triangle = listOf(0, 1, 3, 6, 10, 15, 21, 28, 36, 45)
    val power = listOf(1, 10, 100, 1000, 10000, 100000)

    when (readln().toInt()){
        in fibonacci -> println("F")
        in triangle -> println("T")
        in power -> println("P")
        else -> println("N")
    }
}