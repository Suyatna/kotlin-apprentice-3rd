fun main() {
    val firstRobot = Robot("Experimental Space Navigation Droid")
    val secondRobot = Robot("Extra-Terrestrial Air Safety Droid")

    Battlefield.beginBattle(firstRobot, secondRobot, ::onBattleEnded)
}

fun onBattleEnded(winner: Robot) {
    winner.report("Win!")
}