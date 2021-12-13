import java.util.Random

fun main() {
    println("Hello World!")
    println()

    // 1. valid statements
    // val array1 = Array<Int>() // not valid -> what a specific size
    // val array2 = arrayOf() // not enough information to infer type variable T, what value inside variable T
    // val array3: Array<String> = arrayOf() // valid

    val array4 = arrayOf(1, 2, 3)

    println(array4[0]) // valid
    // println(array4[5]) // index 5 out of bounds for length 3
    array4[0] = 4 // valid

    val array5 = arrayOf(1, 2, 3, 4, 5)

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

    // 3. write a function that removes all occurrences of a given integer from a list of integers.
    fun remove(item: Int, list: List<Int>): List<Int> {
        val mutableList = list.toMutableList()
        while (item in mutableList) {
            mutableList.remove(item)
        }

        return mutableList.toList()
    }

    val repeatedFours = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 4)
    val noFours = remove(4, repeatedFours)
    println(noFours.joinToString())

    // 4. write a function that does a similar thing, without reverse, and returns a new array with the element
    // of the original array in reverse order.
    fun reverse(array: Array<Int>): Array<Int> {
        val newArray = Array(array.size) { 0 }
        for (i in array.indices) {
            newArray[i] = array[array.size - i - 1]
        }

        return newArray
    }

    val array6 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val arrayReversed = reverse(array6)
    println(arrayReversed.joinToString())

    // 5. the function below returns a random number between from (inclusive) and the to (exclusive).
    // write a function that shuffle the elements of an array in random order
    val random = Random()
    fun rand(from: Int, to: Int): Int {
        return random.nextInt(to - from) + from
    }

    fun randomized(array: Array<Int>): Array<Int> {
        val newArray = Array(array.size) { 0 }
        val usedIndices = mutableListOf<Int>()

        for (i in array.indices) {
            var randomIndex: Int
            while (true) {
                randomIndex = rand(0, array.size)
                if (randomIndex !in usedIndices) {
                    usedIndices.add(randomIndex)
                    break
                }
            }
            newArray[i] = array[randomIndex]
        }

        return newArray
    }

    val arrayOrdered = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val arrayRandomized = randomized(arrayOrdered)
    println(arrayRandomized.joinToString())
    println()

    println(arrayOrdered.size)
    for (i in 0..50) {
        print("${rand(0, arrayOrdered.size)} ")
    }
}