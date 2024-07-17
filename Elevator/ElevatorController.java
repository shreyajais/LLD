package LLD.Elevator;

import java.util.ArrayList;
import java.util.List;

public class ElevatorController {

    private static ElevatorController elevatorController;
    private final List<InternalDispatcher> internalDispatchers;
    private final List<ExternalDispatcher> externalDispatchers;

    private ElevatorController() {
        this.internalDispatchers = new ArrayList<>();
        this.externalDispatchers = new ArrayList<>();
    }
    public static synchronized ElevatorController getInstance(){
        if(elevatorController==null) elevatorController = new ElevatorController();
        return elevatorController;
    }
}
