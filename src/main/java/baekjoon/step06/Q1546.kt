package baekjoon.step06

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine()!!.toInt()

    var max = Double.MIN_VALUE
    var sum = 0.0
    val st = StringTokenizer(br.readLine()!!)
    repeat(n) {
        val score = st.nextToken().toDouble()
        sum += score
        max = max.coerceAtLeast(score)
    }
    val average = sum / max * 100 / n
    bw.write("$average")

    bw.flush()
    bw.close()
}