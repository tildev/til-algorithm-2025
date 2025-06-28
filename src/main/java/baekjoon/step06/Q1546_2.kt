package baekjoon.step06

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine()!!.toInt()
    val scores = br.readLine().split(" ").map { it.toDouble() }

    val maxScore = scores.maxOrNull() ?: 0.0
    val newScore = scores.map { it / maxScore * 100 }
    val average = newScore.average()

    bw.write("$average")

    bw.flush()
    bw.close()
}