package LLD.HotelManagementSystem.domain.Room;

public class RoomFactory {

    RoomFactory instance;

    public RoomFactory getInstance(){
        if(instance == null) return new RoomFactory();
        else return instance;
    }

    public RoomElement getRoom(RoomType roomType){
        switch (roomType){
            case SUIT : return new SuitRoomElement();
            case DELUX: return new DeluxRoomElement();
            case SINGLE: return new SingleRoomElement();
            default: return new SingleRoomElement();
        }
    }

    public Integer getRoomPrice(RoomType roomType){
        switch (roomType){
            case SUIT : return 5000;
            case DELUX: return 3000;
            case SINGLE: return 1500;
            default: return 1500;
        }
    }

}
