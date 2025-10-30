package abstraction.abstact;

public class Car extends Vehicle{

    public void drives() {
        
        System.out.println("Driving a car.");
    }

    @Override
    public void stop() {
      
        System.out.println("Stopping the car.");
    }
    
}
