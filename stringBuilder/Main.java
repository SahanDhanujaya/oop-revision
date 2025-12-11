package stringBuilder;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //append
        sb.append("Hello World");
        System.out.println(sb);
        sb.append(" How Are yu ?");
        System.out.println(sb);
        //insert
        sb.insert(21, "o");
        System.out.println(sb);
        //replace
        sb.replace(0, 5, "Hi!,");
        System.out.println(sb);
        //delete
        sb.delete(0, 5);
        System.out.println(sb);
        //reverse
        sb.reverse();
        System.out.println(sb);
        //capacity
        System.out.println(sb.capacity());
        
    }
}
