package baekjoon.step08

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val st = StringTokenizer(br.readLine()!!)
    val n = st.nextToken().toString()
    val b = st.nextToken().toInt()

    val result = n.toLong(b)

    bw.write("$result")

    bw.flush()
    bw.close()
}