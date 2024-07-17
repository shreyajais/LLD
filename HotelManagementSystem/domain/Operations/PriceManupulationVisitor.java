package LLD.HotelManagementSystem.domain.Operations;

import LLD.HotelManagementSystem.domain.Room.DeluxRoomElement;
import LLD.HotelManagementSystem.domain.Room.RoomElement;
import LLD.HotelManagementSystem.domain.Room.SingleRoomElement;
import LLD.HotelManagementSystem.domain.Room.SuitRoomElement;

public class PriceManupulationVisitor implements RoomOperationVisitor{

    @Override
    public void createOperation(SingleRoomElement singleRoomElement) {

    }

    @Override
    public void createOperation(DeluxRoomElement deluxRoomElement) {

    }

    @Override
    public void createOperation(SuitRoomElement suitRoomElement) {

    }
}
