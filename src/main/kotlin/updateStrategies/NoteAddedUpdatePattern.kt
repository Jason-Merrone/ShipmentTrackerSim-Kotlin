package updateStrategies

import TrackingSimulator

class NoteAddedUpdatePattern(): ShippingUpdateStrategy {
    override fun updateShipment(id: String, previousStatus: String?, timestamp: Long, otherInfo: String?) {
        val shipment = TrackingSimulator.findShipment(id)
        shipment?.addNote(otherInfo)
        shipment?.notifyObservers()
    }
}