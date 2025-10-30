package inharitance;

public class Car extends Vehicle { // Car is a vehicle
    Color color; // Car has a color

    Car(){
        this.color = new Color();
        color.color = "Red";
        color.hexvalue = "#FF0000";
        color.rgbValue = "(255, 0, 0)";
        
    }
}
