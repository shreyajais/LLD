package LLD.HotelManagementSystem.domain;

import LLD.HotelManagementSystem.domain.Room.RoomType;

import java.util.Map;

public class Hotel {
    String id;
    String name;
    Address address;
    Map<RoomType, Integer> roomCountPerType;

    public Map<RoomType, Integer> getRoomCountPerType() {
        return roomCountPerType;
    }
}
