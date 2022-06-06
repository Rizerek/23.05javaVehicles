package com.company.classes.Engines;

public class ElectricEngine extends Engine implements com.company.classes.interfaces.Engine {
    public ElectricEngine(String name, int engineCapacity, int maxVelocity, int maxHeight) {
        super(name, engineCapacity, maxVelocity, maxHeight);
    }

    public void turnOnEngine()
    {
        System.out.println("Engine "+super.getName()+" has been turned on!");
    }
    public void drive(int velocity)
    {
        if(velocity<super.getMaxVelocity())
        {
            System.out.println("Engine "+super.getName()+" is driving with velocity of:" + velocity + " km/h!");
        }else{
            System.out.println("Engine "+super.getName()+" is driving with velocity of:" + super.getMaxVelocity() + " km/h!");
        }

    }
}
