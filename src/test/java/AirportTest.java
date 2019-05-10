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
    }

    @Test
    public void airportStartsWithEmptyHangar() {
        assertEquals(0, airport.countPlanesInHangar());
    }

    @Test
    public void canAddPlaneToHangar() {
        airport.addPlaneToHangar(plane);
        assertEquals(1, airport.countPlanesInHangar());
    }

    @Test
    public void canCreateFlights() {
        airport.addPlaneToHangar(plane);
        airport.createFlight(850, "Rhodes");
        assertEquals(0, airport.countPlanesInHangar());
        assertEquals(1, airport.countScheduledFlights());
    }
    
}
