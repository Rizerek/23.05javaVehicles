package com.company.classes.Vehicles;

public class Tram extends Vehicle {
    public void writeClassName(){
        System.out.println(super.getClassName());
    }
    public void writeVehicleName(){
        System.out.println(super.getName());
    }
    public void buyVehicle(){
        System.out.println("Vehicle " +super.getName()+ " has been bought for " +super.getPrice()+ ".");
        sellVehicle();
    }
    public void sellVehicle(){
        System.out.println("Vehicle " +super.getName()+ " has been sold for " +super.getPrice()+ ".");
    }
    public void drive(int velocity)
    {
        if(velocity<super.getEngine().getMaxVelocity())System.out.println("Vehicle " +super.getName()+ " is driving with speed of " +velocity+ "km/h.");
        else System.out.println("Vehicle " +super.getName()+ " is driving with max speed of " +super.getEngine().getMaxVelocity()+ "km/h.");
    }


}
