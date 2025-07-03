package baekjoon.step07

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val s = br.readLine()!!.trim()

    if (s.isEmpty()) {
        bw.write("0")
    } else {
        bw.write("${s.split(" ").size}")
    }

    bw.flush()
    bw.close()
}