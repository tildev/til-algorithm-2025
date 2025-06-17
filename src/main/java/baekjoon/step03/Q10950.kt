package baekjoon.step03

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val t = br.readLine().toInt()

    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        println(a + b)
    }
}