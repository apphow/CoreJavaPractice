package stringbuilder;

public class StringBuilderExample {
    // StringBuilder is faster than StringBuffer because
    //StringBuffer is synchronized

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Welcome to ");
        builder.append("Java");

        System.out.println(builder);
        System.out.println(builder.length());
        System.out.println(builder.reverse());
        System.out.println(builder.reverse());
        System.out.println(builder.length());
        System.out.println(builder.insert(builder.length(), " World"));
        System.out.println(builder.insert(8, " ** inserted here **"));

        System.out.println(builder.delete(8, 28));
        System.out.println(builder.delete(0,11));
    }
}
