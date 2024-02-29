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
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    val size = arr.size
    var positiveCount = 0
    var negativeCount = 0
    var zeroCount = 0
    var positiveRatio: Double
    var zeroRatio: Double
    var negativeRatio: Double

    arr.forEach { value ->
        when {
            value > 0 -> positiveCount += 1
            value < 0 -> negativeCount += 1
            value == 0 -> zeroCount += 1   
        }
    }

    positiveRatio = positiveCount.toDouble() / size
    negativeRatio = negativeCount.toDouble() / size
    zeroRatio = zeroCount.toDouble() / size

    println("%.6f".format(positiveRatio))
    println("%.6f".format(negativeRatio))
    println("%.6f".format(zeroRatio))

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}