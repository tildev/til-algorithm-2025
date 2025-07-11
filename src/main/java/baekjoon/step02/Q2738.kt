package baekjoon.step02

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    val a = Array(n) {
        br.readLine().split(" ").map { it.toInt() }
    }

    val b = Array(n) {
        br.readLine().split(" ").map { it.toInt() }
    }

    val result = Array(n) { row ->
        IntArray(m) { col ->
            a[row][col] + b[row][col]
        }
    }

    result.forEach { row ->
        bw.write(row.joinToString(" "))
        bw.newLine()
    }

    bw.flush()
    bw.close()
}