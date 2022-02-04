import exceptions.AliensAttackException
import exceptions.SpaceCraftException

object SpacePort {
    fun investigateSpace(spaceCraft: SpaceCraft) {
        try {
            spaceCraft.launch()
        } catch (exception: SpaceCraftException) {
            spaceCraft.sendMessageToEarth(exception.localizedMessage)
            spaceCraft.overhaul()
        } catch (exception: AliensAttackException) {
            spaceCraft.sendMessageToEarth(exception.localizedMessage)
        } finally {
            if (spaceCraft.isInSpace) {
                spaceCraft.land()
            } else {
                investigateSpace(spaceCraft)
            }
        }
    }

    fun testSetup(spaceCraft: SpaceCraft) = try {
        spaceCraft.launch()
        true
    } catch (exception: SpaceCraftException) {
        false
    } finally {
        spaceCraft.land()
    }
}