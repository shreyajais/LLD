package LLD.InventoryManagement.domain;

import java.util.List;

public class Category {
    String id;
    List<Product> productList;
    List<Category> categoryList; // composite pattern
}
