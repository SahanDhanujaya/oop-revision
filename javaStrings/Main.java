class Main {
    public static void main(String[] args) {
        String name = "Hello Java";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);

        StringBuilder sb = new StringBuilder("Hello Java");
        System.out.println(sb.reverse());
        System.out.println(sb.delete(0, 3));

    }
}