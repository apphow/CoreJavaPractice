package wrapperclass;

public class AutoBoxingUnboxing {

    public static void main(String[] args) {

        Double dub = 12.0; // auto-boxing of double
        double d = dub; // auto-unboxing of Double

        System.out.println(dub);
        System.out.println(d);

        Integer in = 5; // Auto-boxing of int
        int i = in; // auto-unboxing of int

        System.out.println(in);
        System.out.println(i);

        Character cha = 'a'; //Auto-boxing of char
        char b = cha; // Auto-unboxing of char

        System.out.println(cha);
        System.out.println(b);
    }
}
