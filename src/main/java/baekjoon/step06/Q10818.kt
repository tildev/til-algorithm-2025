package baekjoon.step06

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine()!!.toInt()
    val st = StringTokenizer(br.readLine()!!)

    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    repeat(n) {
        val num = st.nextToken().toInt()
        min = min.coerceAtMost(num)
        max = max.coerceAtLeast(num)
    }
    bw.write("$min $max")
    bw.flush()
    bw.close()
}