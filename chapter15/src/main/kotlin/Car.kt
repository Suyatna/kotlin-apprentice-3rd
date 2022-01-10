class Car(val carName: String) {
    inner class Engine(val engineName: String) {
        override fun toString(): String {
            return "$engineName engine is a $carName"
        }
    }
}