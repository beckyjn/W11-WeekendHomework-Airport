public enum PlaneType {
    SMOLPLANE(2),
    REGULARSIZEDRUDY(10),
    BIGBOI(20),
    MEGAPLANE(40);

    private final int capacity;
    PlaneType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
