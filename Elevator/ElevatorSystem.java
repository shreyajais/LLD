package LLD.Elevator;

import java.util.ArrayList;
import java.util.List;

public class ElevatorSystem {
    private static ElevatorSystem elevatorSystem;
    private final int numberOfElevators;
    private final ElevatorController elevatorController;
    private final int[] floorList;

    private ElevatorSystem() {
        this.numberOfElevators = 2;
        this.elevatorController = ElevatorController.getInstance();
        this.floorList = new int[]{1, 2, 3, 4, 5, 6, 7, 8};;
    }
    public static synchronized ElevatorSystem getInstance(){
        if(elevatorSystem==null) elevatorSystem = new ElevatorSystem();
        return elevatorSystem;
    }


}
