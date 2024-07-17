package LLD.InventoryManagement.domain;

public class Shipment extends AbstractTimelineEntity{
    String id;
    Address source;
    Address destination;
    ShipmentStatus shipmentStatus;
}
