import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.AIRBUSA330, Airline.KLM);
        flight = new Flight(plane, 754, "Barcelona");
    }

    @Test
    public void flightHasCapacity() {
        assertEquals(406, flight.getCapacity());
    }

    @Test
    public void flightStartsWithNoPassengers() {
        assertEquals(0, flight.countPassengers());
    }
}
