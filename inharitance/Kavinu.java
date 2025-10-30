package inharitance;

public class Kavinu extends Student{
    Kavinu(){
        // this(); recursive call
        // super();
    //    super();
    }
    Kavinu(int age) {
        super(age); // current object constructor
    }

    void sample(){
        // this(); // can't call current object constructor
    }
}
