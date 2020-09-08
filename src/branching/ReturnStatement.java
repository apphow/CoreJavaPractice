package branching;

public class ReturnStatement {

    // use a return statement in a switch case statement

    public static void main(String[] args) {

        boolean bool = true;
        System.out.println("Before the return");
        if (bool)
            return;
        System.out.println("This statement will be executed");

        /*
        int k = 4;
        switch (k) {
            case 1 :
                System.out.println("1");
                break;
            case 2 :
                System.out.println("2");
                break;

            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                return;
        }
        System.out.println("Welcome");

         */
    }
}
