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
 * Complete the 'flippingMatrix' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
 */

fun flippingMatrix(matrix: Array<Array<Int>>): Int {
    var sum = 0
    val size = matrix.size

    for (i in 0 until size / 2) {
        for (j in 0 until size / 2) {
            sum += maxOf(matrix[i][j],
                         maxOf(matrix[i][size - 1 - j],
                               maxOf(matrix[size - 1 - i][j], matrix[size - 1 - i][size - 1 - j])))
        }
    }
    return sum
}

fun main(args: Array<String>) {
    val q = readLine()!!.trim().toInt()

    for (qItr in 1..q) {
        val n = readLine()!!.trim().toInt()

        val matrix = Array<Array<Int>>(2 * n, { Array<Int>(2 * n, { 0 }) })

        for (i in 0 until 2 * n) {
            matrix[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
        }

        val result = flippingMatrix(matrix)

        println(result)
    }
}
