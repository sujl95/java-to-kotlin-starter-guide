package me.thewing.lec11

data class Fruit(
    val name: String? = null,
    val price: Int = 0
)

fun main() {
    val fruits = mutableListOf<Fruit>(
        Fruit("wing", 100)
    )

    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "wing"
    }

    filterFruits(fruits) {it.name == "wing" }
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}

