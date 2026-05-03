// These are some extra questions on nullSafety

fun main() {

//    1. Declare a nullable String and print its length using safe call. 
    val name: String? = readlnOrNull()
    var displayName: String? = name?.length?.toString()
    println(displayName)
//    2. Use Elvis operator to print "No Name" if name is null.
    displayName = name ?: "No Name"
//    3. Convert: username!!.length → safe call version.
    val safename = name!!
    
//    4. What is wrong with: val x = name.length if name is String??
//    5. Write an example where !! crashes your program.
//    6. Use let to print a value only if not null.
//    7. Use run to lowercase a nullable string.
//    8. Combine ?. and ?: in one expression.
//    9. What does Int? mean? Write an example.
//    10. Write a nullable Int and safely multiply it by 10.
//    11. Write a chain like: email?.trim()?.lowercase()
//    12. Convert a nullable list to size using safe calls.
//    13. Use let to print the length of a nullable list.
//    14. Use run to operate on a nullable user object with multiple fields.
//    15. Rewrite an unsafe expression to a fully null-safe one.
//    16. Show a case where let is better than if (x != null).
//    17. Show a case where run is cleaner than let.
//    18. What does Elvis operator prevent in Android apps?
//    19. Explain why !! is almost always a bad choice.
//    20. Safely access a nullable nested property (user?.profile?.email).
}