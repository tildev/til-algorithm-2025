package baekjoon.step08

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val t = br.readLine()!!.toInt()

    repeat(t) {
        var change = br.readLine()!!.toInt()

        val quarter = change / 25
        change %= 25

        val dime = change / 10
        change %= 10

        val nickel = change / 5
        change %= 5

        val penny = change

        bw.write("$quarter $dime $nickel $penny\n")
    }

    bw.flush()
    bw.close()
}