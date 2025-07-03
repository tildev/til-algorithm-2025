package baekjoon.step07

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val st = StringTokenizer(br.readLine()!!)

    val a = st.nextToken().reversed().toInt()
    val b = st.nextToken().reversed().toInt()

    bw.write("${maxOf(a, b)}")

    bw.flush()
    bw.close()
}