class Boat: SizedVehicle, Comparable<Boat> {
    override fun compareTo(other: Boat): Int {
        return when {
            length > other.length -> 1
            length == other.length -> 0
            else -> -1
        }
    }

    override var length: Int = 0

}