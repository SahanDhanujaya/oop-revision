package stringBuffer;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); //16bit
        System.out.println(sb);
        sb.append(" Hello World");
        System.out.println(sb.capacity());
        System.out.println(sb);
        sb.insert(6, "Java");
        System.out.println(sb);
        sb.replace(0, 5, "Hi!");
        System.out.println(sb);
        sb.delete(0, 5);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}
