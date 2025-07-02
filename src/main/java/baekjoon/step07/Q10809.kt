package baekjoon.step07

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val s = br.readLine()!!
    val alphabet = IntArray(26) { -1 }

    for (i in s.indices) {
        val index = s[i] - 'a'
        if (alphabet[index] == -1) {
            alphabet[index] = i
        }
    }

    bw.write(alphabet.joinToString(" "))

    bw.flush()
    bw.close()
}