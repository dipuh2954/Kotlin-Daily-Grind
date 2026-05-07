// These are some extra questions on nullSafety

fun main() {

//    1. Declare a nullable String and print its length using safe call. 
    val name: String? = readlnOrNull()
    println(name?.length)
//    2. Use Elvis operator to print "No Name" if name is null.
    println(name ?: "No Name")
//    3. Convert: username!!.length → safe call version.
    username?.length
//    4. What is wrong with: val x = name.length if name is String??
//    A String? can hold null , If you try to access using .length directly kotlin throws an error because it might throw an NullPointerException. name?.length must be used or a null check.
//    5. Write an example where !! crashes your program.
    val data: String? = null
    println(data!!.length) // throws nullPointer exception
//    6. Use let to print a value only if not null.
    name?.let { println(it) }
//    7. Use run to lowercase a nullable string.
    name?.run { lowercase() }
//    8. Combine ?. and ?: in one expression.
    val length = name?.length ?: 0
//    9. What does Int? mean? Write an example.
    //It means either the result or Intput is either int or null
//    10. Write a nullable Int and safely multiply it by 10.
    val num: Int? = readlnOrNull()?.toInt()
    val result = num?.times(10)
    println("$length is $result")
//    11. Write a chain like: email?.trim()?.lowercase()
    val formatetedEmail = userEmail?.trim()?.lowercase()
//    12. Convert a nullable list to size using safe calls.
    val list: List<String>? = readlnOrNull()?.split(',')
    val size = list?.size
//    13. Use let to print the length of a nullable list.
    list?.let { println("List size: ${it.size}") }
//    14. Use run to operate on a nullable user object with multiple fields.
    val user = readlnOrNull()
    user?.run {
        println("Name: $name")
        println("Email: $email")
        println("Age: $age")
    }
//    15. Rewrite an unsafe expression to a fully null-safe one.
//    16. Show a case where let is better than if (x != null).
//    17. Show a case where run is cleaner than let.
//    18. What does Elvis operator prevent in Android apps?
//    19. Explain why !! is almost always a bad choice.
//    20. Safely access a nullable nested property (user?.profile?.email).
}