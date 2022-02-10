fun main() {
    val participants = arrayListOf(
        Robot("Extra-Terrestrial Neutralize Bot"),
        Robot("Generic Evasion Droid"),
        Robot("Self-Reliant War Management Device"),
        Robot("Advanced Nullification Android"),
        Robot("Rational Network Defense Droid"),
        Robot("Motorized Shepherd Cyborg"),
        Robot("Reactive Algorithm Entity"),
        Robot("Ultimate Safety Guard")
    )
    println()

    val topCategory = participants
        .filter { it.strength > 80 }
        .take(3)
        .sortedBy { it.name }

    for (topParticipants in topCategory) {
        println(topParticipants.name)
    }
}