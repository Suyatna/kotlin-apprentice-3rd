fun main() {
    // declaration of variable that can hold a lambda:
    var multiplyLambda: (Int, Int) -> Int = { a: Int, b: Int -> Int
        a * b
    }
    println(multiplyLambda(3, 4))

    // shorthand syntax
    multiplyLambda = { a, b -> a * b}
    println(multiplyLambda(5, 7))

    // it keyword
    val doubleLambda: (Int) -> Int = { 2 * it }
    println(doubleLambda(10))

    val square: (Int) -> Int = { it * it }
    println(square(4))
    println()

    // lambda as arguments
    fun operateOnNumbers(
        a: Int,
        b: Int,
        operation: (Int, Int) -> Int
    ): Int {
        val result = operation(a, b)
        println(result)
        return result
    }

    val addLambda = { a: Int, b: Int ->
        a + b
    }
    operateOnNumbers(4, 2, operation = addLambda)

    fun addFunction(a: Int, b: Int) = a + b
    operateOnNumbers(4, 2, operation = ::addFunction)

    // define lambda inline
    operateOnNumbers(4, 2, operation = { a: Int, b: Int ->
        a + b
    })

    // simply lambda syntax and remove boilerplate, trailing lambda syntax
    operateOnNumbers(4, 2) { a, b -> a + b }

    // using + operator, the + operator is just an operator function plus() in the Int class
    // that takes two arguments and returns one result
    operateOnNumbers(4, 2, operation = Int::plus)
}