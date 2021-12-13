fun main() {
    println("Hello World!")
    println()

    // 1. valid statements
    // val array1 = Array<Int>() // not valid -> what a specific size
    // val array2 = arrayOf() // not enough information to infer type variable T, what value inside variable T
    val array3: Array<String> = arrayOf() // valid

    val array4 = arrayOf(1, 2, 3)

    println(array4[0]) // valid
    // println(array4[5]) // index 5 out of bounds for length 3
    array4[0] = 4 // valid

    val array5 = arrayOf(1, 2, 3)

    array5[0] = array5[1] // valid
    // array5[0] = "six" // type mismatch
    // array5 += 6 // val cannot reassign
    // for item in array5 { println(item) } // should include ()

    // 2. write a function that removes the first occurrence of a given integer from a list of integer.
    fun removeOne(item: Int, list: List<Int>): List<Int> {
        val mutableList = list.toMutableList()
        mutableList.remove(item)

        return mutableList.toList()
    }

    val number = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val newNumber = removeOne(4, number)
    println(newNumber.joinToString())
}