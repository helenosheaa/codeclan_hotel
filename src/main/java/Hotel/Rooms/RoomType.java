package Hotel.Rooms;

public enum RoomType {
    SINGLE(1, "Single", 59.99),
    DOUBLE(2, "Double", 78.99),
    TRIPLE(3, "Triple", 99.99),
    SUITE(4, "Suite", 129.99),
    DINING(20, "Dining Room", 100.00),
    CONFERENCE(30, "Conference Room", 66.66);


    private int capacity;
    private String type;
    private double rate;

    RoomType(int capacity, String type, double rate){
        this.capacity = capacity;
        this.type = type;
        this.rate = rate;

    }

    public double getRoomRate() {
        return rate;
    }

    public String getRoomType(){
        return type;
    }

    public int getCapacity() {
        return capacity;
    }
}

