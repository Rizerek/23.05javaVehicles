package com.company.classes.Vehicles;

import com.company.Enums.Colors;
import com.company.classes.Engines.Engine;
import com.company.classes.interfaces.Air;
import com.company.classes.interfaces.Fuel;
import com.company.classes.interfaces.Water;

public class FloatPlane extends Vehicle implements Air, Water, Fuel {
    public FloatPlane(Colors color, String name, String className, int fuelCapacity, int fuel, int price, Engine engine) {
        super(color, name, className, fuelCapacity, fuel, price, engine);
    }

    public void writeClassName(){
        System.out.println(super.getClassName());
    }
    public void writeVehicleName(){
        System.out.println(super.getName());
    }

    public void fillFuel(int fuelAmount){
        if((super.getFuel()+fuelAmount)< super.getFuelCapacity())System.out.println("Car " +super.getName()+ " has been fueled up with " +fuelAmount+" it has " +(super.getFuel()+fuelAmount)+ ".");
        else System.out.println("Vehicle " +super.getName()+ " has been fueled up with " +(super.getFuelCapacity()-getFuel())+ " and its full.");
    }
    public void fly(int velocity,int height)
    {
        if(velocity<super.getEngine().getMaxVelocity()){
            System.out.println("Vehicle " +super.getName()+ " is flying with speed of " +velocity+ "km/h.");
        }
        else {
            System.out.println("Vehicle " +super.getName()+ " is flying with max speed of " +super.getEngine().getMaxVelocity()+ "km/h.");
        }
        if(height<super.getEngine().getMaxHeight())
        {
            System.out.println("It is flying on " +height+ "m.");
        }else
        {
            System.out.println("It is flying on " +super.getEngine().getMaxHeight()+ "m.");
        }
    }
    public void land()
    {
        System.out.println("Vehicle " +super.getName()+ " landed.");
    }
    public void swim(int velocity)
    {
        if(velocity<super.getEngine().getMaxVelocity())System.out.println("Vehicle " +super.getName()+ " is swimming with speed of " +velocity+ "km/h.");
        else System.out.println("Vehicle " +super.getName()+ " is swimming with max speed of " +super.getEngine().getMaxVelocity()+ "km/h.");
    }
}
