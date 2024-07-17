package LLD.Elevator;

public class InternalDispatcher {

    private final int floorNo;
    private final Display display;
    private final int maxCapacity;
    private int recentFloor;
    private ElevatorState elevatorState;

    public InternalDispatcher(int floorNo) {
        this.floorNo = floorNo;
        this.display = new Display(Direction.UP, 0);
        this.maxCapacity = 60;
        this.recentFloor = 0;
        this.elevatorState = ElevatorState.IDLE;
    }
}
