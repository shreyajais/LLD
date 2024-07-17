package LLD.InventoryManagement.domain;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class WareHouse {
    String id;
    Address address;
    List<Category> categoryList;

    public WareHouse(Address address, List<Category> categoryList) {
        this.id = UUID.randomUUID().toString();
        this.address = address;
        this.categoryList = new ArrayList<>();
    }
    public void addCategory(Category category){
        categoryList.add(category);
    }
    public void removeCategory(Category category){
        categoryList.remove(category);
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }
    public void addProductToCategory(Category category, Product product){

    }
}
