fun main() {
    var age: UShort = 22u // Unsigned Integer : age cannot be negative no matter what
    println("My age is $age")
    age = 23u // Unsigned means it can't be negative & there must be a u at the end of the value
    println("My age now is $age")

    //================ char,unicode and Backslash escape character =================
    val myChar = 'a' // unicode characters it can be smilie too .. all kind of characters
    val new = '\u00AE'
    println("$myChar $new")
}