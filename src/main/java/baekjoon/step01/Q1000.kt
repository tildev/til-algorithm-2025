package baekjoon.step01

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val st = StringTokenizer(br.readLine())

    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    // val (a, b) = br.readLine().split(" ").map { it.toInt() }

    println(a + b)
}