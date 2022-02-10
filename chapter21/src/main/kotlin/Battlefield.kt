object Battlefield {
    fun beginBattle(
        firstRobot: Robot,
        secondRobot: Robot,
        onBattleEnded: (Robot) -> Unit
    ) {

        battle(firstRobot, secondRobot)

        var winner: Robot? = if (firstRobot.isAlive) firstRobot else secondRobot

        if (winner != null) {
            onBattleEnded(winner)
        }
    }

    private fun battle(firstRobot: Robot, secondRobot: Robot) {
        firstRobot attack secondRobot

        if (secondRobot.isAlive.not()) {
            return
        }

        secondRobot attack firstRobot

        if (firstRobot.isAlive.not()) {
            return
        }

        battle(firstRobot, secondRobot)
    }
}