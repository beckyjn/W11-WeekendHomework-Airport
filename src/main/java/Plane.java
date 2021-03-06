import java.util.ArrayList;

public class Plane {
    private PlaneType planeType;
    private Airline airline;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneType planeType, Airline airline){
        this.planeType = planeType;
        this.airline = airline;
        this.passengers = new ArrayList<>();
    }

    public int countPassengers() {
        return passengers.size();
    }

    public int getCapacity() {
        return planeType.getCapacity();
    }

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }
}
