package baekjoon.step04

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val st = StringTokenizer(br.readLine())

    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    val c = st.nextToken().toInt()

    val reward = when {
        a == b && b == c -> 10_000 + a * 1_000
        a == b || a == c -> 1_000 + a * 100
        b == c -> 1_000 + b * 100
        else -> maxOf(a, b, c) * 100
    }

    println(reward)
}