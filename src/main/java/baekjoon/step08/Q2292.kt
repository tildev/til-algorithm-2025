package baekjoon.step08

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine()!!.toLong()

    var layer = 1L
    var maxNum = 1L

    while (n > maxNum) {
        maxNum += 6 * layer
        layer++
    }

    bw.write("$layer")

    bw.flush()
    bw.close()
}