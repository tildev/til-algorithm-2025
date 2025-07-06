package baekjoon.step52

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val word = br.readLine()!!.uppercase(Locale.getDefault())

    val alphabetCount = IntArray(26)

    for (char in word) {
        alphabetCount[char - 'A']++
    }

    val max = alphabetCount.maxOrNull()!!
    val maxIndices = alphabetCount.withIndex().filter { it.value == max }

    if (maxIndices.size > 1) {
        bw.write("?")
    } else {
        bw.write("${'A' + maxIndices[0].index}")
    }

    bw.flush()
    bw.close()
}