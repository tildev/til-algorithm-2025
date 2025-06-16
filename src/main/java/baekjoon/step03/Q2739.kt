package baekjoon.step03

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()

    for (i in 1..9) {
        println("$n * $i = ${n * i}")
    }
}