import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val num1 = scanner.nextLine()
    val num2 = scanner.nextLine()

    val convert = num1.toLong()  + num2.toLong()
    println(convert)
}