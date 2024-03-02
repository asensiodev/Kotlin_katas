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
import kotlin.math.absoluteValue

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var leftDiagonalSum: Int
    var rightDiagonalSum: Int
    val size = arr[0].size
    val leftToRightDiagonal = Array<Int>(size) { 0 }
    val rightToLeftDiagonal = Array<Int>(size) { 0 }

    val range = (0..size - 1)
    for (i in range) {
        leftToRightDiagonal[i] = arr[i][i]
    }

    for (i in range.reversed()) {
        rightToLeftDiagonal[i] = arr[i][(size - 1) - i]
    }

    leftDiagonalSum = leftToRightDiagonal.sum()
    rightDiagonalSum = rightToLeftDiagonal.sum()

    return (leftDiagonalSum - rightDiagonalSum).absoluteValue
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}