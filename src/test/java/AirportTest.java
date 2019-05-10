import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Plane plane;
    Airport airport;
    @Before
    public void before() {
        airport = new Airport("EDI");
        plane = new Plane(PlaneType.AIRBUSA220, Airline.LOGANAIR);
        airport.addPlaneToHangar(plane);
        airport.createFlight(850, "Orkney");
    }

//    @Test
//    public void airportStartsWithEmptyHangar() {
//        assertEquals(0, airport.countPlanesInHangar());
//    }

//    @Test
//    public void canAddPlaneToHangar() {
//        assertEquals(1, airport.countPlanesInHangar());
//    }

    @Test
    public void canCreateFlights() {
        assertEquals(0, airport.countPlanesInHangar());
        assertEquals(1, airport.countScheduledFlights());
    }

    @Test
    public void canSellTickets() {
        airport.sellTicket(850);
        assertEquals(1, plane.countPassengers());
    }
}
