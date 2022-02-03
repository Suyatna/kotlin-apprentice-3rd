class SpaceCraft {
    private var isConnectionAvailable: Boolean = false
    private var isEngineInOrder: Boolean = false
    private var fuel: Int = 0
    var isInSpace: Boolean = false

    fun launch() {
        if (fuel < 5) {
//            sendMessageToEarth("Out of fuel. Can't take off")
            throw Exception("Out of fuel. Can't take off")
            return
        }

        if (!isEngineInOrder) {
//            sendMessageToEarth("The engine is broken. Can't take off")
            throw Exception("The engine is broken. Can't take off")
            return
        }

        if (!isConnectionAvailable) {
//            sendMessageToEarth("No connection with Earth. Can't take off")
            throw Exception("No connection with Earth. Can't take off")
            return
        }
        // remaining launch code

        sendMessageToEarth("Trying to launch...")
        fuel -= 5
        sendMessageToEarth("I'm in space!")
        sendMessageToEarth("I've found some extraterrestrials")
        isInSpace = true
    }

    private fun sendMessageToEarth(message: String) {
        println("Spacecraft to Earth: $message")
    }
}

object SpacePort {
    fun investigateSpace(spaceCraft: SpaceCraft) {
        spaceCraft.launch()
    }
}