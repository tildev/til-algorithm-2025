package baekjoon.step07

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val st = StringTokenizer(br.readLine()!!)

    bw.write("${st.countTokens()}")

    bw.flush()
    bw.close()
}