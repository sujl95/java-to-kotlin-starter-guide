package me.thewing.lec04

data class Money(
    val amount: Long
) {
    operator fun plus(other: Money): Money {
        return Money(this.amount + other.amount)
    }
}

fun main() {
    val money1 = Money(1_000)
    val money2 = Money(2_000)
    println(money1 + money2)
}
