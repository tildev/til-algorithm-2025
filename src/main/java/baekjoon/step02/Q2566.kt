package baekjoon.step02

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val board = Array(9) {
        br.readLine()!!.split(" ").map { it.toInt() }
    }

    var maxValue = Int.MIN_VALUE
    var rowIndex = 0
    var colIndex = 0

    for (i in 0 until 9) {
        for (j in 0 until 9) {
            if (board[i][j] > maxValue) {
                maxValue = board[i][j]
                rowIndex = i
                colIndex = j
            }
        }
    }

    bw.write("$maxValue\n")
    bw.write("${rowIndex + 1} ${colIndex + 1}")

    bw.flush()
    bw.close()
}