package polymorphism;

public class MathsTeacher extends Teacher {
    @Override
    public void teach() {
        System.out.println("Teaching maths.");
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluating maths.");
    }
    
    public static void main(String[] args) {
        MathsTeacher mathsTeacher = new MathsTeacher();
        mathsTeacher.teach();
        mathsTeacher.evaluate();

        Teacher teacher = new MathsTeacher(); // Upcasting
        teacher.evaluate();

        mathsTeacher = (MathsTeacher) teacher; // Downcasting
        mathsTeacher.evaluate();
        
    }
}
