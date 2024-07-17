package LLD.InventoryManagement.domain;

import LLD.InventoryManagement.domain.Address;

import java.util.List;

public class User {
    String id;
    List<Address> addressList;
    List<String> ordersIdList;
    Cart userCartDetails;
}
