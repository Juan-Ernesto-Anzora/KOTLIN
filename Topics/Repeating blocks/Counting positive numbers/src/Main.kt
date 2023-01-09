fun main() {
    val n = readln().toInt()
    var positive = 0

    repeat(n) {
        val next = readln().toInt()
        if (next> 0) positive++
    }
    println(positive)
}