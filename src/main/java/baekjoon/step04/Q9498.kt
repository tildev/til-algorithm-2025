package baekjoon.step04

fun main() {
    val br = System.`in`.bufferedReader()
    val score = br.readLine().toInt()

    when {
        90 <= score -> println("A")
        80 <= score -> println("B")
        70 <= score -> println("C")
        60 <= score -> println("D")
        else -> println("F")
    }
}