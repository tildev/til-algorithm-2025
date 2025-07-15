package baekjoon.step08

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine()!!.toInt()

    val side = (1 shl n) + 1

    bw.write("${side * side}")

    bw.flush()
    bw.close()
}