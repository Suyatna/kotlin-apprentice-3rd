class Bike: WheeledVehicle {
    var peddling = false
    var brakesApplied = false

    override val numberOfWheels: Int = 2
    override var wheelSize: Double = 622.0

    override fun accelerate() {
        peddling = true
        brakesApplied = false
    }

    override fun stop() {
        peddling = false
        brakesApplied = true
    }

}