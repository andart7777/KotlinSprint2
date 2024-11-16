package lesson11

fun main() {
    val dish1: Dish = Dish(
        id = 1,
        name = "Яичница",
        category = "Завтраки",
        ingredients = listOf("яйцо", "помидор", "соль", "перец"),
    )

    val dish2 = Dish(
        id = 2,
        name = "Суп лапша",
        category = "Обеды",
        ingredients = listOf("вода", "курица", "вермишель", "перец"),
    )

    val ingredient1 = Ingredient()
    ingredient1.name = "Andrew"
    println(ingredient1.name)

//    println(dish1.id)
//    println(dish1.name)
//    println(dish1.category)
//    println(dish1.ingredients)
//    println(dish1.inFavorite)
//    println()
//    println(dish2.id)
//    println(dish2.name)
//    println(dish2.category)
//    println(dish2.ingredients)
//    println(dish2.inFavorite)
//    println()

    // Изменение значений

//    dish1.category = "Блюда из яиц"
//    dish2.inFavorite = true
//    println(dish1.category)
//    println(dish2.inFavorite)

    // Использование функций класса

//    println("Действие для блюда: ${dish1.name}")
//    dish1.addToFavorite()
//    println(dish1.inFavorite)
//
//    println()
//
//    println("Действие для блюда: ${dish2.name}")
//    dish2.addToFavorite()
//    println(dish2.inFavorite)
//    val ingredientsForSoup = dish2.downloadIngredients()
//    println(ingredientsForSoup)
//    dish2.removeFromFavorite()
//    println(dish2.inFavorite)

}
