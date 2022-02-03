fun main() {
    val spaceCraft = SpaceCraft()
    SpacePort.investigateSpace(spaceCraft)

    println("Test spacecraft: ${SpacePort.testSetup(spaceCraft)}")
}