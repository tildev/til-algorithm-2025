package baekjoon.step01

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val st = StringTokenizer(br.readLine())

    val inputYear = st.nextToken().toInt()

    println(inputYear - 543)
}