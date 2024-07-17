package LLD.RestaurantManagementSystem.StaffManagement;

import java.util.UUID;

public class Staff {
    private final String id;
    private final String name;

    private final StaffRole staffRole;
    private final String contact;

    private boolean isAvailable;

    public Staff(String name, StaffRole staffRole, String contact) {
        this.id = generate(name);
        this.name = name;
        this.staffRole = staffRole;
        this.contact = contact;
    }

    private String generate(String name){
        return "DA" + name + UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public StaffRole getStaffRole() {
        return staffRole;
    }
}
