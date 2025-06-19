package baekjoon.step03

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val t = br.readLine()!!.toInt()

    for (i in 1..t) {
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        bw.write("Case #${i}: ${a + b}\n")
    }
    bw.flush()
    bw.close()
}