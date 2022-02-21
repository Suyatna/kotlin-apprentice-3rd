import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val firstDeferred = BuildingYard().startProjectAsync("Smart House 01", 10)
        val secondDeferred = BuildingYard().startProjectAsync("Smart House 02", 12)
        listOf(firstDeferred, secondDeferred).awaitAll()
    }
}