package nextedclass;

public class InnerTest {

    public static void main(String[] args) {

        InnerClassExample outerObject = new InnerClassExample();
        InnerClassExample.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.show();

        }
    }

