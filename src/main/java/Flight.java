public class Flight {
    private Plane plane;
    private int flightNum;
    private String destination;

    public Flight(Plane plane, int flightNum, String destination){
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
    }

    public int getCapacity() {
        return plane.getCapacity();
    }

    public int countPassengers() {
        return plane.countPassengers();
    }

    public int getFlightNumber() {
        return this.flightNum;
    }

    public void addPassenger(Passenger passenger) {
        plane.addPassenger(passenger);
    }
}
