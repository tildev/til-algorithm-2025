package baekjoon.step07

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val ch = br.readLine().first()

    bw.write("${ch.code}")

    bw.flush()
    bw.close()
}