import java.util.ArrayList;

public class Airport {
    private ArrayList<Plane> hangar;
    private String airportCode;
    private ArrayList<Flight> scheduledFlights;

    public Airport(String airportCode){
        this.hangar = new ArrayList<>();
        this.airportCode = airportCode;
        this.scheduledFlights = new ArrayList<>();
    }

    public int countPlanesInHangar() {
        return hangar.size();
    }

    public void addPlaneToHangar(Plane plane) {
        hangar.add(plane);
    }

    public void createFlight(int flightNum, String destination) {
        Plane plane = removePlaneFromHangar();
        Flight flight = new Flight(plane, flightNum, destination);
        scheduledFlights.add(flight);
    }

    private Plane removePlaneFromHangar() {
        Plane plane = hangar.remove(0);
        return plane;
    }

    public int countScheduledFlights() {
        return scheduledFlights.size();
    }
}
