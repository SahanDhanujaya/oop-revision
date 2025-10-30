package abstraction.interfaces;

public class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Driving a car.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the car.");
    }
	
}
