package com.company.classes.Vehicles;

import com.company.Enums.Colors;
import com.company.classes.Engines.Engine;

public abstract class Vehicle {
    private Colors color;
    private String name;
    private String className= "Vehicle";
    private int fuelCapacity;
    private int fuel;
    private int price;
    private Engine engine;

    public Vehicle() {
    }

    public Vehicle(Colors color, String name,String className, int fuelCapacity,int fuel, int price, Engine engine) {
        this.color = color;
        this.name = name;
        this.className =  className;
        this.fuelCapacity = fuelCapacity;
        this.fuel = fuel;
        this.price = price;
        this.engine = engine;
    }



    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


}
