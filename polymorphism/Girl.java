package polymorphism;

public class Girl implements Number{ // Girl is a Number
    final void sendNumberr(){
        System.out.println("Number");
    }

    @Override
    public void sendNumber() {
       System.out.println("Number");
    }

    public static void main(String[] args) {
        Number girl = new Girl();
        girl.sendNumber();
    }
    
}