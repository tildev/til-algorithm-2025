package baekjoon.step03

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val x = br.readLine().toInt()
    val n = br.readLine().toInt()

    var total = 0
    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        total += (a * b)
    }
    println(if (total == x) "Yes" else "No")
}