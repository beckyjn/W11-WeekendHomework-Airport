import java.util.ArrayList;

public class Airport {
    private ArrayList<Plane> hanger;
    private String airportCode;

    public Airport(String airportCode){
        this.hanger = new ArrayList<>();
        this.airportCode = airportCode;
    }
}
