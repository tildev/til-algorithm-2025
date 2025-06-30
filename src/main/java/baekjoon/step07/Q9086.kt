package baekjoon.step07

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val t = br.readLine()!!.toInt()

    repeat(t) {
        val word = br.readLine()!!.toString()
        bw.write("${word.first()}${word.last()}\n")
    }

    bw.flush()
    bw.close()
}