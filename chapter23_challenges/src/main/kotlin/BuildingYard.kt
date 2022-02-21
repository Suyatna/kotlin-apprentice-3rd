import kotlinx.coroutines.*

class BuildingYard {

    private val scope = CoroutineScope(Dispatchers.Default)

    suspend fun startProjectAsync(name: String, floors: Int): Deferred<Building> {

        return scope.async {
            val building = Building(name, scope = this)

            val cores = Runtime.getRuntime().availableProcessors()

            building.speakThroughBullhorn("The building of $name is started with $cores building machine engaged")
            // Any other phases couldn't be started until foundation isn't ready
            building.makeFoundation().join()

            (1..floors).forEach {
                var floorsNumber = 0

                try {
                    // A floor should be raised before we can decorate it
                    floorsNumber = building.buildFloor(it)
                } catch (e: Exception) {
                    building.speakThroughBullhorn(e.message ?: "")

                    while (floorsNumber < it) {
                        try {
                            floorsNumber = building.buildFloor(it)
                        } catch (e: Exception) {
                            // NOP
                        }
                    }
                }

                // These decorations could be made at the same time
                building.placeWindows(it)
                building.installDoors(it)
                building.provideElectricity(it)
                building.fitOut(it)
            }

            building.buildRoof().join()
            building.speakThroughBullhorn("${building.name} is ready")
            building
        }
    }
}