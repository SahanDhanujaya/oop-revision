import java.util.ArrayList;

class Example {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("BMW");
        arr.add("BENZ");
        arr.add("VOLOV");

        System.out.println(arr);

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Saman", 23, "GRV"));
        System.out.println(customers.get(0));
    }
}
