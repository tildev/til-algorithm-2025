package baekjoon.step52

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val word = br.readLine()!!
    val isPalindrome = word == word.reversed()

    bw.write("${if (isPalindrome) 1 else 0}")

    bw.flush()
    bw.close()
}