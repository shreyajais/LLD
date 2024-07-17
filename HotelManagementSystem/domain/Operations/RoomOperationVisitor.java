package LLD.HotelManagementSystem.domain.Operations;

import LLD.HotelManagementSystem.domain.Room.DeluxRoomElement;
import LLD.HotelManagementSystem.domain.Room.RoomElement;
import LLD.HotelManagementSystem.domain.Room.SingleRoomElement;
import LLD.HotelManagementSystem.domain.Room.SuitRoomElement;

public interface RoomOperationVisitor {

    public void createOperation(SingleRoomElement singleRoomElement);

    public void createOperation(DeluxRoomElement deluxRoomElement);

    public void createOperation(SuitRoomElement suitRoomElement);
}
