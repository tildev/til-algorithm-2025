package baekjoon.step52

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine()!!.toInt()

    for (i in 1 until n * 2) {
        val space = kotlin.math.abs(n - i)
        val star = 2 * (n - space) - 1
        bw.write("${" ".repeat(space)}${"*".repeat(star)}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}