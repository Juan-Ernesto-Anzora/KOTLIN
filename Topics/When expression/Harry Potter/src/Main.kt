const val BRAVERY = "bravery"
const val LOYALTY = "loyalty"
const val CUNNING = "cunning"
const val INTELLECT = "intellect"
const val INVALID_HOUSE = "not a valid house"

fun main() {
    // write your code here
    when (readln()){
        "gryffindor" -> println(BRAVERY)
        "hufflepuff" -> println(LOYALTY)
        "slytherin" -> println(CUNNING)
        "ravenclaw" -> println(INTELLECT)
        else -> println(INVALID_HOUSE)
    }
}