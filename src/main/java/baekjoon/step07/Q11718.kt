package baekjoon.step07

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    while (true) {
        val line = br.readLine() ?: break
        bw.write(line)
        bw.newLine()
    }

    bw.flush()
    bw.close()
}