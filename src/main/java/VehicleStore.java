import org.w3c.dom.ls.LSOutput;
import products.Product;
import vehicles.*;
import vehicles.air.Helicopter;
import vehicles.air.Plane;
import vehicles.land.Bicycle;
import vehicles.land.Car;
import vehicles.water.Kayak;
import vehicles.water.Speedboat;

import java.util.ArrayList;
import java.util.List;

public class VehicleStore {
    private static List<IVehicle> vehicles;

    public static void main(String[] args) {
        vehicles = new ArrayList<>();
        // create a bike using composition, and call methods from its components
        Bicycle bike1 = new Bicycle(10, 20, new Product("BMX", 350, 6));
        vehicles.add(bike1);

        System.out.println(bike1.getWheelCount());
        System.out.println(bike1.getTitle());
        System.out.println(bike1.getInventory());

        // create a car using composition, and call methods from its multiple components
        Car car1 = new Car(200, 120, new Product("2015 Dacia Duster", 10000, 3),
        new Engine(100, 150));
        vehicles.add(car1);

        car1.startEngine();
        System.out.println(car1.getFuel());
        System.out.println(car1.getPrice());

        // lab tests (water vehicle related)...
        Kayak kayak1 = new Kayak(
                200,
                100,
                new Product("kay", 100, 5),
                "large");
        vehicles.add(kayak1);

        System.out.println(kayak1.getHullType());
        System.out.println(kayak1.getTitle());
        System.out.println(kayak1.getPrice());

        Speedboat speedboat1 = new Speedboat(
                200,
                300,
                new Product("Bayliner", 5000, 4),
                new Motor(200, 150),
                "small");

        vehicles.add(speedboat1);
        speedboat1.startEngine();
        System.out.println(speedboat1.getFuel());
        System.out.println(speedboat1.getPrice());
        System.out.println(speedboat1.getMaxSpeed());

        Plane plane1 = new Plane(
                100,
                5000,
                new Product("Plane", 500, 1),
                new Engine(100, 300), 90
                );

        vehicles.add(plane1);

        plane1.startEngine();
        System.out.println(plane1.getHp());
        System.out.println(plane1.getTitle());


        Helicopter helicopter1 = new Helicopter(
                200,
                350,
                new Product("Buzzard", 6000, 3), 100);

                vehicles.add(helicopter1);

                System.out.println(helicopter1.getLandingSpeed());
                System.out.println(helicopter1.getNumberOfPropellers());




    }
}
