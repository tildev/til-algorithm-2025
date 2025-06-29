package baekjoon.step07

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val s = br.readLine()!!.toString()
    val i = br.readLine()!!.toInt()

    bw.write("${s[i - 1]}")

    bw.flush()
    bw.close()
}