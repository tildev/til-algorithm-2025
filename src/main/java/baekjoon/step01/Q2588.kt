package baekjoon.step01

fun main() {
    val br = System.`in`.bufferedReader()

    val a = br.readLine().toInt()
    val b = br.readLine().toInt()

    println(a * (b % 10))
    println(a * ((b % 100) / 10))
    println(a * (b / 100))
    println(a * b)
}