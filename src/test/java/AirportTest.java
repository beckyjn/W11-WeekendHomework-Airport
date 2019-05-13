import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Plane plane1;
    Plane plane2;
    Plane plane3;
    Plane plane4;
    Airport airport;
    @Before
    public void before() {
        airport = new Airport("EDI");
        plane1 = new Plane(PlaneType.SMOLPLANE, Airline.LOGANAIR);
        plane2 = new Plane(PlaneType.REGULARSIZEDRUDY, Airline.FLYBE);
        plane3 = new Plane(PlaneType.BIGBOI, Airline.KLM);
        plane4 = new Plane(PlaneType.MEGAPLANE, Airline.RYANAIR);

        airport.addPlaneToHangar(plane1);
        airport.addPlaneToHangar(plane2);
        airport.addPlaneToHangar(plane3);
        airport.addPlaneToHangar(plane4);
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
        assertEquals(3, airport.countPlanesInHangar());
        assertEquals(1, airport.countScheduledFlights());
    }

    @Test
    public void canSellTickets() {
        airport.sellTicket(850);
        assertEquals(1, airport.countFlightPassengers(850));
    }

    @Test
    public void cantSellTicketIfFlightFull() {
        airport.sellTicket(850);
        airport.sellTicket(850);
        airport.sellTicket(850);
        assertEquals(2, airport.countFlightPassengers(850));
    }

    
}
