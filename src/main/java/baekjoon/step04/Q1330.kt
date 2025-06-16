package baekjoon.step04

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val st = StringTokenizer(br.readLine())

    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()

    when {
        a > b -> println(">")
        a < b -> println("<")
        else -> println("==")
    }
}