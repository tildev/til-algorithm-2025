package baekjoon.step06

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine()!!.toInt()
    val numbers = br.readLine().split(" ").map { it.toInt() }
    val v = br.readLine().toInt()

    println(numbers.count { it == v })
}