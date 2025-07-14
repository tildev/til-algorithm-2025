package baekjoon.step08

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val st = StringTokenizer(br.readLine()!!)
    val n = st.nextToken().toInt()
    val b = st.nextToken().toInt()

    val result = n.toString(b).uppercase()

    bw.write(result)

    bw.flush()
    bw.close()
}