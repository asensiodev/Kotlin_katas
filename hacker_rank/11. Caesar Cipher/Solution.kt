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
 * Complete the 'caesarCipher' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. INTEGER k
 */

fun caesarCipher(s: String, k: Int): String {
    val latinAlphabetLength = 26
    val shift = k % latinAlphabetLength
    return s.map { char ->
        when {
            char.isLetter() && char.isUpperCase() -> 
                'A' + (char - 'A' + shift) % latinAlphabetLength
            char.isLetter() && char.isLowerCase() -> 
                'a' + (char - 'a' + shift) % latinAlphabetLength
            else -> char
        }
    }.joinToString(separator = "")
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!

    val k = readLine()!!.trim().toInt()

    val result = caesarCipher(s, k)

    println(result)
}
