package control.flow

/**
 * very similar to do...while grammar in java
 * @author Richard_yyf
 * @version 1.0 2020/4/27
 */

fun main() {

    var sum: Int = 0
    var input: String

    do {
        print("Plz Enter an Integer: ")
        // 加!!像Java一样抛出空异常，
        // 另一种字段后加?可不做处理返回值为 null或配合?:做空判断处理
        input = readLine()!!
        sum += input.toInt()
    } while (input != "0")

    println("sum = $sum")
}