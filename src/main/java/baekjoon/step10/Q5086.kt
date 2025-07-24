package baekjoon.step10

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val sb = StringBuilder()

    while (true) {
        val (a, b) = br.readLine()!!.split(" ").map { it.toInt() }
        if (a == 0 && b == 0) break
        sb.append(
            when {
                a % b == 0 -> "multiple"
                b % a == 0 -> "factor"
                else -> "neither"
            }
        ).append("\n")
    }
    bw.write(sb.toString())

    bw.flush()
    bw.close()
}