import kotlin.concurrent.thread

fun main() {
    thread(start = true, name = "another thread") {
        (0..10).forEach {
            println("Message #$it from ${Thread.currentThread().name}")
        }
    }

    (0..10).forEach {
        println("Message #$it from ${Thread.currentThread().name}")
    }
}