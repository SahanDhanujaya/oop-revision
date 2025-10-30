package polymorphism;

public class Boy1 {
    public void method() {
        System.out.println("parameterless method.");
    }

    public void method(String name) {
        System.out.println("parameterized method.");
    }
    public static void main(String[] args) {
        Boy1 boy = new Boy1();
        boy.method();
        boy.method("John");
    }

}
