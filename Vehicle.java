class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void start() {
        System.out.println("Starting the vehicle.");
    }

    public void stop() {
        System.out.println("Stopping the vehicle.");
    }
}

class Motorcycle extends Vehicle {
    private int engineCapacity;
    private String bikeType;

    public Motorcycle(String brand, int year, int engineCapacity, String bikeType) {
        super(brand, year);
        this.engineCapacity = engineCapacity;
        this.bikeType = bikeType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void wheelie() {
        System.out.println("Performing a wheelie on the motorcycle.");
    }

    public void drive() {
        System.out.println("Riding the motorcycle on the road.");
    }
}

class Bus extends Vehicle {
    private int seatingCapacity;
    private boolean doubleDecker;

    public Bus(String brand, int year, int seatingCapacity, boolean doubleDecker) {
        super(brand, year);
        this.seatingCapacity = seatingCapacity;
        this.doubleDecker = doubleDecker;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public boolean isDoubleDecker() {
        return doubleDecker;
    }

    public void boardPassengers() {
        System.out.println("Passengers boarding the bus.");
    }

    public void drive() {
        System.out.println("Driving the bus on the route.");
    }
}

class Trailer extends Vehicle {
    private int loadCapacity;
    private boolean hasRamp;

    public Trailer(String brand, int year, int loadCapacity, boolean hasRamp) {
        super(brand, year);
        this.loadCapacity = loadCapacity;
        this.hasRamp = hasRamp;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public boolean hasRamp() {
        return hasRamp;
    }

    public void loadCargo() {
        System.out.println("Loading cargo onto the trailer.");
    }

    public void tow() {
        System.out.println("Towing the trailer behind another vehicle.");
    }
}

class Boat extends Vehicle {
    private int length;
    private String boatType;

    public Boat(String brand, int year, int length, String boatType) {
        super(brand, year);
        this.length = length;
        this.boatType = boatType;
    }

    public int getLength() {
        return length;
    }

    public String getBoatType() {
        return boatType;
    }

    public void floatOnWater() {
        System.out.println("The boat is floating on the water.");
    }

    public void navigate() {
        System.out.println("Navigating the boat on the water.");
    }
}

public class Main {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle("Honda", 2022, 1000, "Sport");
        Bus bus = new Bus("Volvo", 2019, 50, true);
        Trailer trailer = new Trailer("Utility", 2020, 5000, true);
        Boat boat = new Boat("Sea Ray", 2021, 30, "Yacht");

        motorcycle.wheelie();
        bus.boardPassengers();
        trailer.loadCargo();
        boat.floatOnWater();
    }
}
