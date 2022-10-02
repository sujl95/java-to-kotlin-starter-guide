package me.thewing.lec08

fun main() {
    repeat(str = "hello", num = 4)
}

fun repeat(
    str: String = "123",
    num: Int = 3,
    useNewLine: Boolean = true,
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}
