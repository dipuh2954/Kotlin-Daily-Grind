fun main() {
    // to — infix function that creates a Pair (key to value)
    val studentScores = mapOf(
        "Rahul" to 92,
        "Priya" to 88,
        "Arjun" to 75,
        "Sneha" to 95
    )

    // Accessing values by key
    println(studentScores["Rahul"])         // 92
    println(studentScores["Unknown"])       // null (key doesn't exist)
    println(studentScores.getValue("Priya")) // 88 — throws if key missing
    println(studentScores.getOrDefault("X", 0)) // 0 if key not found
    println(studentScores.getOrElse("X") { -1 })  // -1 (lambda default)

    // Checking existence
    println(studentScores.containsKey("Priya"))   // true
    println(studentScores.containsValue(100))     // false
    println("Rahul" in studentScores)             // true (checks keys)

    // Navigating a map
    println(studentScores.keys)    // [Rahul, Priya, Arjun, Sneha]
    println(studentScores.values)  // [92, 88, 75, 95]
    println(studentScores.entries) // all key-value pairs
    println(studentScores.size)    // 4

    // Iterating over entries
    for ((name, score) in studentScores) {
        println("$name scored $score")
    }

    // Iterating using entries
    studentScores.forEach { (name, score) ->
        println("${name.uppercase()} → $score")
    }
}