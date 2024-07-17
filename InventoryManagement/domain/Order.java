package LLD.InventoryManagement.domain;

import LLD.Splitwise.domain.User;

import java.util.List;

public class Order extends AbstractTimelineEntity {
    String id;
    List<OrderItem> orderItemList;
    User user;
    OrderStatus orderStatus;
}
