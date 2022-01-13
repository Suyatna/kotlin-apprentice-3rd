interface VehicleProperties {
    val weight: Int // abstract
    val name: String
        get() = "Vehicle"
}