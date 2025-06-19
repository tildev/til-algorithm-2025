package baekjoon.step03

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine()!!.toInt()

    val count = n / 4
    println("long ".repeat(count) + "int")
}