package baekjoon.step08

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val st = StringTokenizer(br.readLine()!!)
    val a = st.nextToken().toLong()
    val b = st.nextToken().toLong()
    val v = st.nextToken().toLong()

    val dailyClimb = a - b
    val target = v - b

    // 올림 대신 trick
    val days = (target + dailyClimb - 1) / dailyClimb

    bw.write("$days")

    bw.flush()
    bw.close()
}