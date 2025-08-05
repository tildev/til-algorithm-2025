package programmers.training.day01.l181949

fun main(args: Array<String>) {
    val str = readln()

    val sb = StringBuilder()
    for (c in str) {
        sb.append(
            if (c.isLowerCase()) c.uppercaseChar() else c.lowercaseChar()
        )
    }
    println(sb)
}