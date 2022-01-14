import capable.*
import pet.Bird
import pet.Cat
import pet.Dog
import pet.Fish

fun main() {
    val dog = Dog()
    val cat = Cat()
    val fish = Fish()
    val bird = Bird()

    val feedingDuties: Array<Feedable> = arrayOf(dog, cat, fish, bird)
    val walkingDuties: Array<Walkable> = arrayOf(dog, cat)
    val tankingDuties: Array<Tankable> = arrayOf(fish)
    val cagingDuties: Array<Cageable> = arrayOf(bird)
    val cleaningDuties: Array<Cleanable> = arrayOf(fish, bird)

    for (feedable in feedingDuties) {
        feedable.feed()
    }
    println()

    for (walkable in walkingDuties) {
        walkable.walk()
    }
    println()

    for (tankable in tankingDuties) {
        tankable.tank()
    }
    println()

    for (cageable in cagingDuties) {
        cageable.cage()
    }
    println()

    for (cleanable in cleaningDuties) {
        cleanable.clean()
    }
}