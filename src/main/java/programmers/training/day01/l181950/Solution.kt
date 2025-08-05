package programmers.training.day01.l181950

fun main(args: Array<String>) {
    val input = readln().split(' ')
    val str = input[0]
    val n = input[1].toInt()

    println(str.repeat(n))
}