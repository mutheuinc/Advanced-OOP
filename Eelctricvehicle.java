abstract class ElectricVehicle {
     public abstract String batteryType();
}

class ElectricCar extends ElectricVehicle {
    @Override
    public String batteryType() {
        return "Lithium-ion battery";
    }

}

class ElectricBike extends ElectricVehicle {
    @Override
    public String batteryType() {
        return "Nickel-metal hydride battery";
    }

  }

public class Main {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        ElectricBike electricBike = new ElectricBike();

        System.out.println("Electric car battery type: " + electricCar.batteryType());
        System.out.println("Electric bike battery type: " + electricBike.batteryType());
    }
}
