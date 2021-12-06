fun main() {
    // Mini-Exercises
    // 1.
    var myFavoriteSong: String? = null

    // 2.
    // val parsedInt = "10".toIntOrNull()
    // nullable because Int?

    // 3.
    // val parsedInt = "dog".toIntOrNull()
    // equal null

    // Checking For Null
    var result: Int? = 30
    println(result)
    println()
    // println(result + 1) // will get error, which is not allowed on a nullable receiver

    // Not-Null Assertion Operator
    var authorName: String? = "Joe Howard"
    var authorAge: Int? = 24

    val ageAfterBirthday = authorAge!! + 1
    println("After their next birthday, $authorName will be $ageAfterBirthday")
    println()

//    authorAge = null
//    println("After two next birthday, $authorName will be ${authorAge!! + 2}")
//    // Pointer Exception
//    // Compiler Warning 'ALWAYS_NULL' Options

    // Smart Cast
    var nonNullableAuthor: String
    var nullableAuthor: String?

    if (authorName != null) {
        nonNullableAuthor = authorName
    } else {
        nullableAuthor = authorName
    }

    // Mini-Exercises 2
    // 1.
    if (myFavoriteSong != null) {
        println("I have a favorite song.")
    } else {
        println("I don't have a favorite song.")
    }
    println()

    // 2. Using Smart Cast
    if (myFavoriteSong != null) {
        myFavoriteSong = null
        println("Now I have a favorite song is $myFavoriteSong")
    } else {
        myFavoriteSong = "You're my world"
        println("Now I have a favorite song is $myFavoriteSong")
    }
    println()

    // Safe Calls
    var nameLength = authorName?.length
    println("Author's name has length $nameLength")
    println()

    // The let() Function
    authorName?.let {
        nonNullableAuthor = authorName
        println(nonNullableAuthor)
    }

    authorName?.let {
        nameLength = authorName.length
        println(nameLength)
    }
    println()

    // Elvis Operator
    var nullableInt: Int? = 10
    var mustHaveResult = nullableInt ?: 0 // if (nullableInt != null) nullableInt else 0
    println(mustHaveResult)
    println()
}