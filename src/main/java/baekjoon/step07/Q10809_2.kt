package baekjoon.step07

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val s = br.readLine()!!
    val alphabet = ('a'..'z').map { s.indexOf(it) }
    bw.write(alphabet.joinToString(" "))

    bw.flush()
    bw.close()
}