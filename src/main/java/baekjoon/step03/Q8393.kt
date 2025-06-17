package baekjoon.step03

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine()!!.toInt()

    val sum = n * (n + 1) / 2
    println(sum)
}