package LLD.HotelManagementSystem.domain.Room;

import LLD.HotelManagementSystem.domain.Operations.RoomOperationVisitor;
import jdk.dynalink.Operation;

public interface RoomElement {

    public void accept(RoomOperationVisitor roomOperationVisitor);
}
