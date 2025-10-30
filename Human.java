public class Human {
    //properties
    private String name;
    private int age;
    private String address;

     Human(){}

     Human(String name, int age, String address) {
         this.name = name;
         this.age = age;
         this.address = address;
     }

    //behaviors
    private void eat() {
        int x = 10; //local variable
        System.out.println(name + " is eating.");
    }

    private void sleep() {
        System.out.println(name + " is sleeping.");
    }

    private void walk() {
        System.out.println(name + " is walking.");
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setAddress(String address) {
        this.address = address;
    }

}

