package baekjoon.step07

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val word = br.readLine()!!.toString()

    bw.write("${word.length}")

    bw.flush()
    bw.close()
}