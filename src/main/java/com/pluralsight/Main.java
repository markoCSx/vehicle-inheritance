package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped vibe = new Moped("Make", "Model", "White", 2, 25, 5);
        vibe.setNumberOfPassengers(2);
        vibe.setColor("White");
        vibe.setCargoCapacity(25);
        vibe.setFuelCapacity(5);

        SemiTruck optimus = new SemiTruck("Peterbilt", "379", "Blue", 2, 0, 0);
        optimus.setColor("blue");
        optimus.setModel("Peterbilt");
        optimus.setModel("379");
        optimus.setNumberOfPassengers(2);

        Hovercraft hovercraft = new Hovercraft("Armada", "Seeker", "Blue", 0, 0, 0);
        hovercraft.setMake("Armada");
        hovercraft.setModel("Seeker");
        hovercraft.setColor("Blue");
        hovercraft.setNumberOfPassengers(0);

        Car car = new Car("Mazda", "RX-3", "Red", 4, 500, 60);
        car.setMake("Mazda");
        car.setModel("RX-3");
        car.setNumberOfPassengers(4);
        car.setFuelCapacity(60);

    }
}
