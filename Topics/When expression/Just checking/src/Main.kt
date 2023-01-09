fun main() {
    // write your code here
    /*println("Which programming language are you learning?\n" +
            "1. Java\n" +
            "2. Kotlin\n" +
            "3. Scala\n" +
            "4. Python") */
    val pL = readln().toInt()
    when {
        pL == 2 -> println("Yes!")
        pL in 1..4 -> println("No!")
        else -> println("Unknown number")
    }
}