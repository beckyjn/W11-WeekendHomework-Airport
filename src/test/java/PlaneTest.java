import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.AIRBUSA220, Airline.EASYJET);
    }

    @Test
    public void planeStartsWithNoPassengers() {
        assertEquals(0, plane.countPassengers());
    }

    @Test
    public void planeHasACapacity() {
        assertEquals(135, plane.getCapacity());
    }
}
