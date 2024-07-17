package LLD.Elevator;

public class Display {
    private Direction Direction;
    private int floor;

    public Display(LLD.Elevator.Direction direction, int floor) {
        Direction = direction;
        this.floor = floor;
    }

    public LLD.Elevator.Direction getDirection() {
        return Direction;
    }

    public int getFloor() {
        return floor;
    }

    public void setDirection(LLD.Elevator.Direction direction) {
        Direction = direction;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
