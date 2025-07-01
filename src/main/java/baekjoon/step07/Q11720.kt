package baekjoon.step07

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine()!!.toInt()
    val num = br.readLine()!!.toString()

    val sum = num.map { it.digitToInt() }.sum()
    bw.write("$sum")

    bw.flush()
    bw.close()
}