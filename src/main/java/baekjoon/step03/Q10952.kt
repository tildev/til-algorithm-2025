package baekjoon.step03

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    while (true) {
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        if (a == 0 && b == 0) {
            break
        }
        bw.write("${a + b}\n")
    }
    bw.flush()
    bw.close()
}