package stringbuffer;

public class StringBufferExample {

    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer("Welcome to ");
        buffer.append("Java");

        System.out.println(buffer);
        System.out.println(buffer.reverse());
        System.out.println(buffer.reverse());
        System.out.println(buffer.length());
        System.out.println(buffer.insert(buffer.length(), " World"));
        System.out.println(buffer.insert(8, " ** inserted here **"));

        System.out.println(buffer.delete(8, 28));
        System.out.println(buffer.delete(0,11));

    }
}
