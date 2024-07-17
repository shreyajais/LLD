package LLD.InventoryManagement.service.WareHouseSelection;

import LLD.InventoryManagement.domain.WareHouse;

import java.util.ArrayList;
import java.util.List;

public class WareHouseController {
    // strategy always have a controller
    List<WareHouse> wareHouseList;
    WareHouseLocationStrategy wareHouseLocationStrategy;

    public WareHouseController(WareHouseLocationStrategy wareHouseLocationStrategy) {
        this.wareHouseList = new ArrayList<>();
        this.wareHouseLocationStrategy = wareHouseLocationStrategy;
    }

    public void addWareHouse(WareHouse wareHouse){
        wareHouseList.add(wareHouse);
    }

    public void removeWareHouse(WareHouse wareHouse){
        wareHouseList.remove(wareHouse);
    }

    public List<WareHouse> getWareHouseList() {
        return wareHouseList;
    }
}
