package LLD.HotelManagementSystem.domain.Room;

import LLD.HotelManagementSystem.domain.Operations.RoomOperationVisitor;

public class DeluxRoomElement implements RoomElement{
    @Override
    public void accept(RoomOperationVisitor roomOperationVisitor) {
        roomOperationVisitor.createOperation(this);
    }
}
