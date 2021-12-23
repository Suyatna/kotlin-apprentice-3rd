fun main() {
    // declaration of variable that can hold a lambda:
    val multiplyLambda: (Int, Int) -> Int = { a: Int, b: Int -> Int
        a * b
    }
    println(multiplyLambda(3, 4))
}