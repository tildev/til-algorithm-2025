package baekjoon.step06

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val x = st1.nextToken().toInt()

    val st2 = StringTokenizer(br.readLine()!!)

    repeat(n) {
        val num = st2.nextToken().toInt()
        if (num < x) {
            bw.write("$num ")
        }
    }
    bw.flush()
    bw.close()
}