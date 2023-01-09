fun main() {
    // write your code here
    val first = readln().toInt()
    val second = readln().toInt()
    val third = readln().toInt()
    val fourth = readln().toInt()
    val fifth = readln().toInt()

    val firstRange = first..second
    val secondRange = third..fourth
    println(fifth in firstRange || fifth in secondRange)
}