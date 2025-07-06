package baekjoon.step52

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val standard = arrayOf(1, 1, 2, 2, 2, 8)
    val found = br.readLine().split(" ").map { it.toInt() }

    val result = standard.zip(found) { s, f -> s - f }
    bw.write(result.joinToString(" "))

    bw.flush()
    bw.close()
}