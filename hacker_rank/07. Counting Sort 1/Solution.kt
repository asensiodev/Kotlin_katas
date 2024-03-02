import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'countingSort' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun countingSort(arr: Array<Int>): Array<Int> {
    var frequencyArr = Array<Int>(100) { 0 }

    var occurrences: Int
    for (i in arr) {
        occurrences = 0
        for (j in arr) {
            if (i == j) {
                occurrences += 1
                frequencyArr[i] = occurrences
            }
        }
    } 

    return frequencyArr

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = countingSort(arr)

    println(result.joinToString(" "))
}
