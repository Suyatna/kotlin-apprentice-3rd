fun main() {
    val marie = Student(1, "Marie", "Curie")
    val albert = Student(2, "Albert", "Einstein")
    val emmy = Student(3, "Emmy", "Noether")

    StudentRegistry.addStudent(marie)
    StudentRegistry.addStudent(albert)
    StudentRegistry.addStudent(emmy)

    StudentRegistry.listAllStudents()
    println(Student.numberOfStudent())
    println()

    val emmyScientist = Scientist.newScientist("Emmy", "Noether")
    val isaac = Scientist.newScientist("Isaac", "Newton")
    val nick = Scientist.newScientist("Nickola", "Tesla")

    ScientistRepository.addScientist(emmyScientist)
    ScientistRepository.addScientist(isaac)
    ScientistRepository.addScientist(nick)

    ScientistRepository.listAllScientists()
    println()

    val counter = object : Counts {
        override fun studentCount(): Int {
            return StudentRegistry.allStudents.size
        }

        override fun scientistCount(): Int {
            return ScientistRepository.allScientists.size
        }
    }

    println(counter.studentCount())
    println(counter.scientistCount())
}