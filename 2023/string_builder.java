public class string_builder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Tony");
        sb.insert(2,'n');
        System.err.println(sb);
        sb.setCharAt(0, 'S');
        System.err.println(sb);

        StringBuilder rev= new StringBuilder("This is a long string");
        System.out.println(rev);
        

    }
}
