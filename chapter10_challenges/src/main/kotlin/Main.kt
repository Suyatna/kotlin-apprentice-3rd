fun main() {
    // 1. repeating yourself
    // write a function that will run a given lambda a given number of times
    fun repeatTask(times: Int, task: () -> Unit) {
        for (time in 0 until times) {
            task()
        }
    }

    repeatTask(10, task = { println("kotlin apprentice book is great!") })

    // 2.
}