fun main() {
    val tasks = mutableListOf("Buy groceries", "Study Kotlin", "Exercise")

    // Add elements
    tasks.add("Read book")          // adds to the end
    tasks.add(1, "Call mom")        // inserts at index 1

    // Update elements
    tasks[0] = "Buy organic groceries"  // replaces index 0

    // Remove elements
    tasks.remove("Exercise")         // removes by VALUE
    tasks.removeAt(0)               // removes by INDEX
    tasks.removeLast()              // removes last element

    // Add all from another list
    val more = listOf("Cook dinner", "Sleep early")
    tasks.addAll(more)

    // Check contents
    println(tasks)
    println(tasks.size)

    // Clear everything
    tasks.clear()
    println(tasks.isEmpty())  // true

    // Sorting a mutable list
    val numbers = mutableListOf(5, 2, 8, 1, 9, 3)
    numbers.sort()          // sorts IN PLACE: [1, 2, 3, 5, 8, 9]
    numbers.sortDescending() // [9, 8, 5, 3, 2, 1]
    numbers.shuffle()       // random order (useful for games)
    numbers.reverse()       // reverses in place
}