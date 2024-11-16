package lesson11

class Dish(
    val id: Int,
    val name: String,
    var category: String,
    val ingredients: List<String>,
    var inFavorite: Boolean = false,
) {
    fun addToFavorite() {
        inFavorite = true
        println("Блюдо $name добавлено в избранное")
    }

    fun removeFromFavorite() {
        inFavorite = false
        println("Блюдо $name удалено из избранного")
    }

    fun startsCooking() {
        println("Приготовление блюда: $name")
    }

    fun downloadIngredients(): List<String> {
        return ingredients
    }

}