package baekjoon.step02

const val PAPER_SIZE = 100
const val COLOR_SIZE = 10

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine()!!.toInt()

    val paper = Array(PAPER_SIZE) { BooleanArray(PAPER_SIZE) }

    repeat(n) {
        val (x, y) = br.readLine()!!.split(" ").map { it.toInt() }
        for (i in x until x + COLOR_SIZE) {
            for (j in y until y + COLOR_SIZE) {
                paper[i][j] = true
            }
        }
    }

    var area = 0
    for (i in 0 until PAPER_SIZE) {
        for (j in 0 until PAPER_SIZE) {
            if (paper[i][j]) {
                area++
            }
        }
    }

    bw.write("$area")

    bw.flush()
    bw.close()
}