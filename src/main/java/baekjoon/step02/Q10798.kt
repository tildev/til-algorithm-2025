package baekjoon.step02

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    var word = List(5) { br.readLine()!! }
    val maxLength = word.maxOf { it.length }
    val sb = StringBuilder()

    for (i in 0 until maxLength) {
        for (j in 0 until 5) {
            if (i < word[j].length) {
                sb.append(word[j][i])
            }
        }
    }
    bw.write(sb.toString())

    bw.flush()
    bw.close()
}