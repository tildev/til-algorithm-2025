package baekjoon.step03

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    while (true) {
        val line = br.readLine() ?: break
        val st = StringTokenizer(line)
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        bw.write("${a + b}\n")
    }
    bw.flush()
    bw.close()
}