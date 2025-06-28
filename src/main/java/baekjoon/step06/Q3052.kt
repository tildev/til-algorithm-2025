package baekjoon.step06

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val divisor = 42
    val remainder = mutableSetOf<Int>()

    repeat(10) {
        val dividend = br.readLine()!!.toInt()
        remainder.add(dividend % divisor)
    }

    bw.write("${remainder.size}")

    bw.flush()
    bw.close()
}