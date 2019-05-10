import java.util.ArrayList;

public class Airport {
    private ArrayList<Plane> hangar;
    private String airportCode;
    private ArrayList<Flight> scheduledFlights;

    public Airport(String airportCode) {
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
        return hangar.remove(0);

    }

    public int countScheduledFlights() {
        return scheduledFlights.size();
    }

    public void sellTicket(int flightNum) {
        Flight flight = getFlight(flightNum);
        Passenger passenger = new Passenger();
        flight.addPassenger(passenger);
    }

    private Flight getFlight(int flightNum) {
        Flight selectedFlight = null;
        for (Flight flight : scheduledFlights) {
            if (flightNum == flight.getFlightNumber()) {
                selectedFlight = flight;
            }
        }
        return selectedFlight;
    }
}

