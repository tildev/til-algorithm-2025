package baekjoon.step03

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine()!!.toInt()

    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        bw.write("${a + b}\n")
    }
    bw.flush()
    bw.close()
}