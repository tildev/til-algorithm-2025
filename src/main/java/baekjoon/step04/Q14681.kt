package baekjoon.step04

fun main() {
    val br = System.`in`.bufferedReader()
    val x = br.readLine()!!.toInt()
    val y = br.readLine()!!.toInt()

    when {
        x > 0 && y > 0 -> println(1)
        x < 0 && y > 0 -> println(2)
        x < 0 && y < 0 -> println(3)
        x > 0 && y < 0 -> println(4)
    }
}