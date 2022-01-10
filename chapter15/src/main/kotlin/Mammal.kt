abstract class Mammal(val birthDate: String) {
    abstract fun consumeFood()
}

class Human(birthDate: String) : Mammal(birthDate) {
    override fun consumeFood() {
        TODO("Not yet implemented")
    }

    fun createBirthCertificate() {
        // ...
    }
}