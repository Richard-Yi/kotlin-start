package control.flow

/**
 *
 * @author Richard_yyf
 * @version 1.0 2020/4/27
 */

fun main() {
    for (i in 1..3) {
        println(i)
    }
    for (i in 6 downTo 0 step 2) {
        println(i)
    }
    for (i in 0 until 6 step 2) {
        println(i)
    }

//    val names = listOf("Anne", "Peter", "Jeff")
    val names = arrayOf("Anne", "Peter", "Jeff")
    println(names.javaClass)
    for ((index, value) in names.withIndex()) {
        println("index:$index;value:$value")
    }

    var text = "Kotlin"

    for (letter in text) {
        println(letter)
    }
}