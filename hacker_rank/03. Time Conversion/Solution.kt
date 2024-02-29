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
import java.time.LocalTime
import java.time.format.DateTimeFormatter


/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    val inputFormatter = DateTimeFormatter.ofPattern("hh:mm:ssa")
    val outputFormatter = DateTimeFormatter.ofPattern("HH:mm:ss")

    val localTime = LocalTime.parse(s, inputFormatter)
    val formattedTime = localTime.format(outputFormatter)
    return formattedTime
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
