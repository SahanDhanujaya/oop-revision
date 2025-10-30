public class Vehicle {
    String brand;
    String model;
    int year;
    String color;

    public Vehicle(){
        /*
         * 
         * {
         *     System.out.println("This is an instance block of super class.");
         * }
         * 
        */
        {
             System.out.println("This is an instance block of super class.");
        }
        System.out.println("Calling a vehicle constructor.");
    }
    // Instance Block
    {
        System.out.println("This is an instance block of super class.");
    }
    void drive() {
        System.out.println("Driving the vehicle.");
    }

    void stop() {
        System.out.println("Stopping the vehicle.");
    }

}
