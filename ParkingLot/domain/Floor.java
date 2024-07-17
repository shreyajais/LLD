package LLD.ParkingLot.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Floor {
    String id;
    String name;
    List<ParkingSpot> parkingSpotList;

    public String getName() {
        return name;
    }

    public List<ParkingSpot> getListOfVacantParkingSpotOfType(ParkingType parkingType){
        return parkingSpotList.stream().filter(parkingSpot -> parkingSpot.isVacant && parkingSpot.parkingType==parkingType).collect(Collectors.toList());
    }
}
