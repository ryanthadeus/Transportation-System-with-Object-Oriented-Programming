package transport;

import transport.*;

public class TransportationDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota Camry", 2000);
        Bus bus = new Bus("City Bus", 50);

        car.start();
        System.out.println("Car fuel efficiency: " + car.calculateFuelEfficiency());
        car.stop();

        bus.start();
        System.out.println("Bus fuel efficiency: " + bus.calculateFuelEfficiency());
        bus.stop();
    }
}