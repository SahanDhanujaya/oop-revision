import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
    //    ArrayList<Student> students = new ArrayList<>();
    //    students.add(new Student("John", "Math", 85.5));
    //    students.add(new Student("Alice", "Science", 90.0));
    //    students.add(new Student("Bob", "History", 78.0));

    //    Student studentHelper = new Student();
    //    studentHelper.subTotal(students);
    //    studentHelper.grade(students);
    //    Human human = new Human();
    //    human.setName("David");
    //    human.setAge(30);
    //    human.setAddress("123 Main St");  
    
        System.out.println("=================Object One================");
        Car.sample();
        new Car();
        
        System.out.println("=================Object Two================");
        new Car();
        Car.sample();


    }
} 