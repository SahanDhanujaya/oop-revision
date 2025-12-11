public class Student {
    private String name;
    private int age;
    private StudentStaus status; // student has a status

    Student(){}
    Student(String name, int age, StudentStaus staus){
        this.name= name;
        this.age = age;
        this.status = staus;
    }
    @Override
    public String toString() {
        return "Student[name=" + name + ", age=" + age + ", status=" + status + "]";
    }
    public static void main(String[] args) {
        Student s1 = new Student("Sahan", 22, StudentStaus.ACTIVE);
        System.out.println(s1);
        
    }
}
