public class Car extends Vehicle {

    public Car(){
        
        /*
        static {
        System.out.println("Car static block.");
        }

        {
            System.out.println("This is an instance block of super class.");
        }

        super();

        {
            System.out.println("Car instance block.");
        }

        Car();

        */
        System.out.println("Calling a car constructor.");
        
    }
    // Instance Block
    {
        System.out.println("Car instance block.");
    }
    // Static Block
    static {
        System.out.println("Car static block.");
    }
    
    public void drive(){
        // super();
        System.out.println("Driving a car.");
    }

    public static void sample(){
        System.out.println("Sample method.");
    }
    
}
