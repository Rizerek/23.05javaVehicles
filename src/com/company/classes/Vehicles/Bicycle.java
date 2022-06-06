package com.company.classes.Vehicles;

import com.company.Enums.Colors;
import com.company.classes.Engines.Engine;
import com.company.classes.interfaces.Ground;

public class Bicycle extends Vehicle implements Ground {
    public Bicycle(Colors color, String name, String className, int fuelCapacity, int fuel, int price, Engine engine) {
        super(color, name, className, fuelCapacity, fuel, price, engine);
    }

    public void writeClassName(){
        System.out.println(super.getClassName());
    }
    public void writeVehicleName(){
        System.out.println(super.getName());
    }

    public void drive(int velocity)
    {
        if(velocity<super.getEngine().getMaxVelocity())System.out.println("Vehicle " +super.getName()+ " is driving with speed of " +velocity+ "km/h.");
        else System.out.println("Vehicle " +super.getName()+ " is driving with max speed of " +super.getEngine().getMaxVelocity()+ "km/h.");
    }
}
