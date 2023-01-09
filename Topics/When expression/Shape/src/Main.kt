const val SHAPE_1 = "square"
const val SHAPE_2 = "circle"
const val SHAPE_3 = "triangle"
const val SHAPE_4 = "rhombus"
const val INVALID_SHAPE = "There is no such shape!"

fun main(args: Array<String>) {
    // write your code here
    when (readln().toInt()){
        1 -> println("You have chosen a $SHAPE_1")
        2 -> println("You have chosen a $SHAPE_2")
        3-> println("You have chosen a $SHAPE_3")
        4 -> println("You have chosen a $SHAPE_4")
        else -> println(INVALID_SHAPE)
    }
}