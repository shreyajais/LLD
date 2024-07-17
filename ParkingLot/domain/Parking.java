package LLD.ParkingLot.domain;

import java.util.List;

public class Parking {
    String id;
    Address address;
    List<Floor> floorList;

    public List<Floor> getFloorList() {
        return floorList;
    }
}
