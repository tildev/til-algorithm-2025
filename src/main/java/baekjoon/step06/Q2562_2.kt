package baekjoon.step06

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val numbers = IntArray(9) { br.readLine()!!.toInt() }

    val max = numbers.maxOrNull()!!
    val index = numbers.indexOf(max) + 1
    bw.write("$max\n$index")
    bw.flush()
    bw.close()
}