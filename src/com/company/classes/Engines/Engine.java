package com.company.classes.Engines;

public abstract class Engine {
    private String name;
    private int engineCapacity;
    private int maxVelocity;
    private int maxHeight;

    public Engine() {
    }

    public Engine(String name, int engineCapacity, int maxVelocity, int maxHeight) {
        this.name = name;
        this.engineCapacity = engineCapacity;
        this.maxVelocity = maxVelocity;
        this.maxHeight = maxHeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(int maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }
}
