package base.intro

/**
 *
 * @author Richard_yyf
 * @version 1.0 2020/4/28
 */

fun main() {

    /*
   TODO
       Kotlin中的基础数据类型：
       - kotlin内置的表示number的类型
         - Byte : -128 to 127 (8-bit signed two's complement integer)
         - Short : from -32768 to 32767 (16-bit signed two's complement integer)
         - Int :  -2^31 to 2^31-1 (32-bit signed two's complement integer)
         - Long : -2^63 to 2^63-1 (64-bit signed two's complement integer)
         - Float : a single-precision 32-bit floating point
         - Double : double-precision 64-bit floating point.
         - Number
   */
    val range : Byte = 112
    println("range:$range")
    val intNum = 11
    println("intNum:$intNum")
    val floatNum = 11.1F
    println("floatNum:$floatNum")
    val doubleNum = 11.11
    println("doubleNum:$doubleNum")

    // TODO 如果你对变量值不确定，你可以确定一个Number类型

    var test : Number = 12.2
    println(test)

    test = 12
    // Int smart cast from Number
    println("Int smart cast from Number: $test")

    test = 120L
    println("Long smart cast from Number: $test")

    // 上述内容，可以参照Kotlin smart casts 进一步学习

    // TODO kotlin Char
    val letter: Char = 'k'
    println("letter:$letter")
    // the following code gives error in Kotlin but works fine in Java
//    var le : Char = 65

    // TODO kotlin arrays

    // TODO kotlin Strings

    /* TODO
        推荐延伸阅读：
        - Type conversion in Kotlin
        - Smart casts in Kotlin
        - Kotlin nullable types
     */

    // =====================


}