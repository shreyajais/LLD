package LLD.Elevator;

import java.util.List;

public class ExternalDispatcher {

    private final int floorNo;
    private final Display display;

    private boolean isRequested;
    private List<Direction> direction;

    public ExternalDispatcher(int floorNo, Display display, List<Direction> direction) {
        this.floorNo = floorNo;
        this.display = display;
        this.direction = direction;
    }
}
