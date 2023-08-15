package week_1.Challenge_10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(4);
        Truck truck = new Truck(8);

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(car);
        vehicleList.add(truck);

        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.getClass().getSimpleName()+" has " + vehicle.getNumberOfWheels() + " wheels.");
        }

    }
}
