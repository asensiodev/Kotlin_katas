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
 * Complete the 'towerBreakers' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER m
 */

fun towerBreakers(n: Int, m: Int): Int {

    val player1 = 1
    val player2 = 2
    val numberOfTowers = n
    val towersHeight = m



}

fun isOptimalMove(possibleMoves: Array<Int>): Boolean {
    return possibleMoves.size == 0
}

fun getPossibleMoves(towerHeight: Int, numberOfTowers: Int) : Array<Int> {
    val possibleMoves: Array<Int> = emptyArray()
    var arrIndex = 0
    for (i in 1..(towerHeight - 1)) {
        if (towerHeight % i == 0 && towerHeight > i) {
            possibleMoves[arrIndex] = i
            arrIndex++
        }
    }
    return possibleMoves
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val first_multiple_input = readLine()!!.trimEnd().split(" ")

        val n = first_multiple_input[0].toInt()

        val m = first_multiple_input[1].toInt()

        val result = towerBreakers(n, m)

        println(result)
    }
}
