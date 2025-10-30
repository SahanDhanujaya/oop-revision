import java.util.ArrayList;

public class Student {
    //name, subject, mark
    String name;
    String subject;
    double mark;

    Student() {
    }

    Student(String name, String subject, double mark) {
        this.name = name;
        this.subject = subject;
        this.mark = mark;
    }

    //subtotal()
    void subTotal(ArrayList<Student> arr) {
        double sum = 0;
        for (Student s : arr) {
            sum += s.mark;
        }
        System.out.println("Subtotal: " + sum);
    }
    //grade(arr)
    void grade(ArrayList<Student> arr) {
        for (Student s : arr) {
            String grade;
            if (s.mark >= 90) {
                grade = "A";
            } else if (s.mark >= 80) {
                grade = "B";
            } else if (s.mark >= 70) {
                grade = "C";
            } else if (s.mark >= 60) {
                grade = "S";
            } else {
                grade = "F";
            }
            System.out.println("Student: " + s.name + ", Grade: " + grade);
        }

    }

}
