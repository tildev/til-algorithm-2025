package baekjoon.step04

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val st = StringTokenizer(br.readLine())

    var a = st.nextToken()!!.toInt()
    var b = st.nextToken()!!.toInt()
    var c = br.readLine()!!.toInt()

    val totalMinutes = a * 60 + b + c
    val endHour = (totalMinutes / 60) % 24
    val endMinute = totalMinutes % 60

    println("$endHour $endMinute")
}