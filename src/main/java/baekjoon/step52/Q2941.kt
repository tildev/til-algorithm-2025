package baekjoon.step52

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val input = br.readLine()!!
    val croatianAlphabet = listOf(
        "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="
    )

    var word = input
    for (token in croatianAlphabet) {
        word = word.replace(token, " ")
    }

    bw.write("${word.length}")

    bw.flush()
    bw.close()
}