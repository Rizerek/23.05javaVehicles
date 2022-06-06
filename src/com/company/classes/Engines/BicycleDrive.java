package com.company.classes.Engines;

import com.company.Enums.Colors;
import com.company.classes.Engines.Engine;

public class BicycleDrive extends Engine{
    public BicycleDrive(String name, int engineCapacity, int maxVelocity, int maxHeight) {
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
