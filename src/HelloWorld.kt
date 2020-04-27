/**
 *
 * @author Richard_yyf
 * @version 1.0 2020/4/26
 */
var x = 0
val PI = 3.14

fun incr() {
    x += 1
}

// 行注释
/*  start
 /* 嵌套注释 */
    end    */


fun main() {
    println("Hello world")
    println("x = $x ; PI = $PI")
    incr()
    println("x = $x ; PI = $PI")
}