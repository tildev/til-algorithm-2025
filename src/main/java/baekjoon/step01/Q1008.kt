package baekjoon.step01

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val st = StringTokenizer(br.readLine())

    val a = st.nextToken().toDouble()
    val b = st.nextToken().toDouble()

    println(a / b)
}