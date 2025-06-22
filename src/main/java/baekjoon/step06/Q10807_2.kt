package baekjoon.step06

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine()!!.toInt()
    val st = StringTokenizer(br.readLine())
    val v = br.readLine().toInt()
    var result = 0
    repeat(n) {
        if (v == st.nextToken().toInt()) {
            result++
        }
    }
    println(result)
}