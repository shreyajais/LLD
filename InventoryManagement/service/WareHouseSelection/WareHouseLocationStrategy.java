package LLD.InventoryManagement.service.WareHouseSelection;

import LLD.InventoryManagement.domain.Product;
import LLD.InventoryManagement.domain.WareHouse;

import java.util.List;

public interface WareHouseLocationStrategy {

    public WareHouse fetchWareHouse(Product product, int quantity, List<WareHouse> wareHouseList);
}
