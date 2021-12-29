class Scientist private constructor(
    val id: Int,
    firstName: String,
    lastName: String
) {
    companion object {
        private var currentId = 0

        fun newScientist(
            firstName: String,
            lastName: String
        ): Scientist {
            currentId += 1
            return Scientist(currentId, firstName, lastName)
        }
    }

    var fullName = "$firstName $lastName"
}

object ScientistRepository {
    private val allScientists = mutableListOf<Scientist>()

    fun addScientist(scientist: Scientist) {
        allScientists.add(scientist)
    }

    fun removeScientist(scientist: Scientist) {
        allScientists.remove(scientist)
    }

    fun listAllScientists() {
        allScientists.forEach {
            println("${it.id}: ${it.fullName}")
        }
    }
}