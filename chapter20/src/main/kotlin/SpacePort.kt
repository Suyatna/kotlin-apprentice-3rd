object SpacePort {
    fun investigateSpace(spaceCraft: SpaceCraft) {
        try {
            spaceCraft.launch()
        } catch (exception: Exception) {
            spaceCraft.sendMessageToEarth(exception.localizedMessage)
        }
    }
}