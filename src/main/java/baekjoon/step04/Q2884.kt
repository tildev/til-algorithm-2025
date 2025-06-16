package baekjoon.step04

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val st = StringTokenizer(br.readLine())

    var hour = st.nextToken()!!.toInt()
    var minute = st.nextToken()!!.toInt()

    minute -= 45
    if (minute < 0) {
        minute += 60
        hour -= 1
        if (hour < 0) {
            hour = 23
        }
    }
    println("$hour $minute")
}