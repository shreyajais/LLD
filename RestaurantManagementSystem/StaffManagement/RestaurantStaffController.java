package LLD.RestaurantManagementSystem.StaffManagement;

import java.util.ArrayList;
import java.util.List;

public class RestaurantStaffController {

    private List<Staff> staffList;
    private List<Staff> chefs;
    private List<Staff> manager;
    private List<Staff> waiters;
    private List<Staff> cleaners;

    private static RestaurantStaffController restaurantStaffController;


    private RestaurantStaffController() {
        this.staffList = new ArrayList<>();
        this.chefs = new ArrayList<>();;
        this.manager = new ArrayList<>();;
        this.waiters = new ArrayList<>();;
        this.cleaners = new ArrayList<>();;
    }

    public static synchronized RestaurantStaffController getInstance(){
        if(restaurantStaffController==null){
            restaurantStaffController = new RestaurantStaffController();
        }
        return restaurantStaffController;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(Staff staff) {
        this.staffList.add(staff);
        switch (staff.getStaffRole()){
            case CHEF -> setChefs(staff);
            case WAITER -> setWaiters(staff);
            case CLEANER -> setCleaners(staff);
            case MANAGER -> setManager(staff);
            default -> setCleaners(staff);
        }
    }

    public List<Staff> getChefs() {
        return chefs;
    }

    public void setChefs(Staff chefs) {
        this.chefs.add(chefs);
    }

    public List<Staff> getManager() {
        return manager;
    }

    public void setManager(Staff manager) {
        this.manager.add(manager);
    }

    public List<Staff> getWaiters() {
        return waiters;
    }

    public void setWaiters(Staff waiters) {
        this.waiters.add(waiters);
    }

    public List<Staff> getCleaners() {
        return cleaners;
    }

    public void setCleaners(Staff cleaners) {
        this.cleaners.add(cleaners);
    }
}
