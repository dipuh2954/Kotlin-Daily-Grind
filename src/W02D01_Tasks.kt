fun main() {
    //Create an immutable list of 5 country names. Print the second and fourth country using index access.
    val country = listOf("USA", "India", "France", "Germany", "Japan")
    println(country[1])
    //Create a mutable shopping list. Add 3 items, remove the middle one, then update the first item's name. Print the final list.
    val shopping = mutableListOf("Bag", "Groceries", "Salad")
    shopping.add("Shirt")
    shopping.add("Jeans")
    shopping.add("CellPhone")

    shopping.removeAt(shopping.size / 2)
    shopping[0] = "Tablet"

    println(shopping)
    //Given a list of numbers [10, 3, 7, 1, 8, 5], sort it ascending using sort() and print. Then reverse and print again.

    // Use withIndex() to print: "Position 0: Apple", "Position 1: Banana" etc. for a list of fruits.
    // Try accessing index 100 on a list of 3 items using both list[100] (catch the crash) and list.getOrNull(100) . Observe the difference.

}