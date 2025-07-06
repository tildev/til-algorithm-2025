package baekjoon.step52

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val word = br.readLine()!!
    var isPalindrome = true

    for (i in 0 until word.length / 2) {
        if (word[i] != word[word.length - 1 - i]) {
            isPalindrome = false
            break
        }
    }

    if (isPalindrome) {
        bw.write("1")
    } else {
        bw.write("0")
    }

    bw.flush()
    bw.close()
}