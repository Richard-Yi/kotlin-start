package control.flow

/**
 *
 * @author Richard_yyf
 * @version 1.0 2020/4/26
 */

fun main() {
    test("hello")
    test(5)
    test(2)
    test(3)
    test(1000)
}

fun test(x : Any) {
    when (x) {
        is String -> println("x is String: $x")
        1 -> println("x = 1")
        2 -> println("x = 2")
        3, 4 -> println("x = 3 or x = 4")
        in 5..10 -> println("x is between 5 and 10")
        else -> {
            println("x is not between 1 and 10")
        }
    }
}