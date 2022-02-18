import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch(Dispatchers.Default) {
        (0..10).forEach {
            println("Message #$it from the ${Thread.currentThread().name}")
        }
    }

    (0..10).forEach {
        println("Message #$it from the ${Thread.currentThread().name}")
    }
}