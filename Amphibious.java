interface Amphibious {
    void dock();
    void launch();
}

interface AirVehicle {
    void fly();
}

class AmphibiousPlane implements Amphibious, AirVehicle {
    @Override
    public void dock() {
        System.out.println("Amphibious Plane is docking.");
    }

    @Override
    public void launch() {
        System.out.println("Amphibious Plane is launching.");
    }

    @Override
    public void fly() {
        System.out.println("Amphibious Plane is flying.");
    }
}

public class Main {
    public static void main(String[] args) {
        AmphibiousPlane amphibiousPlane = new AmphibiousPlane();

        amphibiousPlane.dock();
        amphibiousPlane.launch();
        amphibiousPlane.fly();
    }
}
