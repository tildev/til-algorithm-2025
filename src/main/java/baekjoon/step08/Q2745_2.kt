package baekjoon.step08

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val st = StringTokenizer(br.readLine()!!)
    val n = st.nextToken().toString()
    val b = st.nextToken().toInt()

    var result = 0

    for ((index, c) in n.reversed().withIndex()) {
        val digit = when(c){
            in '0'..'9' -> c - '0'
            in 'A'..'Z' -> c - 'A' + 10
            else -> error("Invalid character: $c")
        }
        result += digit * Math.pow(b.toDouble(), index.toDouble()).toInt()
    }
    bw.write(result.toString())

    bw.flush()
    bw.close()
}