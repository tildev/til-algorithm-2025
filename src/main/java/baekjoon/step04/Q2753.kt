package baekjoon.step04

fun main() {
    val br = System.`in`.bufferedReader()
    val year = br.readLine()!!.toInt()
    val isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)

    println(if (isLeap) 1 else 0)
}