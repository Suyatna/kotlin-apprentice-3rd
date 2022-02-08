fun main() {
    // never get `result` printed as the return statement
    fun calculateEven() {
        var result = 0

        (0..20).forEach {
            if (it % 3 == 0) return

            if (it % 2 == 0) result += it
        }

        println(result)
    }
    println(calculateEven())
    println()

    /* if you only need to return from the lambda expression, you can use a qualified return
       this way as soon as an element is a multiple of three,
       the current iteration of the loop will be interrupted and the next one will start
       this behaviour is similar to the use of a `continue` statement.
    */
    fun calculateEvenQualifiedReturn() {
        var result = 0

        (0..20).forEach {
            if (it % 3 == 0) {
                println(it)
                return@forEach
            }

            if (it % 2 == 0) {
                println(it)
                result += it
                println("result: $result")
            }
        }

        println(result)
    }
    println(calculateEvenQualifiedReturn())
    println()

    // return to the place you need
    fun calculateEvenExplicitLabel() {
        var result = 0

        (0..20).forEach loop@{
            if (it % 3 == 0) return@loop

            if (it % 2 == 0) result += it
        }

        println(result)
    }
    println(calculateEvenExplicitLabel())
    println()

    fun calculateEvenAnonymous() {
        var result = 0

        (0..20).forEach(fun(value) {

            if (value % 3 == 0) return

            if (value % 2 == 0) result += value
        })

        println(result)
    }
    println(calculateEvenAnonymous())
}