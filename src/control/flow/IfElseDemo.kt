package control.flow

/**
 *
 * @author Richard_yyf
 * @version 1.0 2020/4/26
 */

fun main() {
    val ret = choose(1, 2)
    print("\nresult : $ret")
}

fun choose(a: Int, b: Int) : Int {
    return if (a > b) {
        print("choose a : $a")
        a
    } else {
        print("choose b : $b")
        b
    }
}