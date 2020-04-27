package control.flow

/**
 *
 * @author Richard_yyf
 * @version 1.0 2020/4/27
 */
fun main(args: Array<String>) {

    // labeled break often used in multiple layer loop

    first@ for (i in 1..4) {

        second@ for (j in 5..8) {
            if (i + j == 9) {
                continue@first
//                continue@second
            }
            println("i + j = $i + $j = ${i+j}")
        }
    }
}
