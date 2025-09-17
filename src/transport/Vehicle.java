package transport;

public abstract class Vehicle {
    protected int speed;
    protected String model;

    public Vehicle(String model) {
        this.model = model;
        this.speed = 0;
    }

    public void start() {
        System.out.println(model + " is starting...");
    }

    public void stop() {
        System.out.println(model + " is stopping...");
        this.speed = 0;
    }

    abstract double calculateFuelEfficiency();
}