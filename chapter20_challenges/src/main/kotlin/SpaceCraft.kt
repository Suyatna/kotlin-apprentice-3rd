import exceptions.BrokenEngineException
import exceptions.OutOfFuelException
import exceptions.SpaceToEarthConnectionFailedException

class SpaceCraft {
    private var isConnectionAvailable: Boolean = false
    private var isEngineInOrder: Boolean = false
    private var fuel: Int = 0
    var isInSpace: Boolean = false

    fun launch() {
        if (fuel < 5) {
            throw OutOfFuelException()
        }

        if (!isEngineInOrder) {
            throw BrokenEngineException()
        }

        if (!isConnectionAvailable) {
            throw SpaceToEarthConnectionFailedException()
        }

        sendMessageToEarth("Trying to launch...")
        fuel -= 5
        sendMessageToEarth("I'm in space!")
        sendMessageToEarth("I've found some extraterrestrials")
        isInSpace = true
    }

    private fun refuel() {
        fuel += 5
        sendMessageToEarth("The fuel tank is filled")
    }

    private fun repairEngine() {
        isEngineInOrder = true
        sendMessageToEarth("The engine is in order")
    }

    private fun fixConnection() {
        isConnectionAvailable = true
        sendMessageToEarth("Hello Earth! Can you hear me?")
        sendMessageToEarth("Connection is established")
    }

    fun land() {
        sendMessageToEarth("Landing...")
        isInSpace = false
    }

    fun overhaul() {
        if (fuel < 5) {
            refuel()
        }

        if (!isEngineInOrder) {
            repairEngine()
        }

        if (!isConnectionAvailable) {
            fixConnection()
        }
    }

    fun sendMessageToEarth(message: String) = println("Spacecraft to Earth: $message")
}