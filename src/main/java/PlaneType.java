public enum PlaneType {
    AIRBUSA220(135),
    AIRBUSA320(236),
    AIRBUSA330(406),
    AIRBUSA380(535),
    BOEING737(230),
    BOEING777(400);

    private final int capacity;
    PlaneType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
