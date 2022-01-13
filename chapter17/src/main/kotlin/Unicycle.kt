class Unicycle: Vehicle {
    var peddling = false

    override fun accelerate() {
        peddling = true
    }

    override fun stop() {
        peddling = false
    }
}