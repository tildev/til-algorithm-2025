package baekjoon.step52

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val standard = arrayOf(1, 1, 2, 2, 2, 8)

    val st = StringTokenizer(br.readLine()!!)

    for (i in standard.indices) {
        val value = st.nextToken().toInt()
        bw.write("${standard[i] - value} ")
    }

    bw.flush()
    bw.close()
}