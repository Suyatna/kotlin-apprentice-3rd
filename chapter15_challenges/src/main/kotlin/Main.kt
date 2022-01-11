fun main() {
    // challenge 1
    val c = C()
    val a = A()

    println(c)
    println(a)
    println()

    // challenge 2
    println(c as A)
    // I use `as` because I'm sure that C is a subclass of A and I know I don't have to handle the null case

    println(a as? C)
    // I use `as?` because A is not a subclass of C and I want to avoid a runtime exception
}