package baekjoon.step06

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val hasSubmitted = BooleanArray(31)

    repeat(28) {
        val num = br.readLine().toInt()
        hasSubmitted[num] = true
    }

    for (i in 1..30) {
        if (!hasSubmitted[i]) {
            bw.write("$i\n")
        }
    }
    bw.flush()
    bw.close()
}