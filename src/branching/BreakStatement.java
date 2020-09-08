package branching;

public class BreakStatement {
    public static void main(String[] args) {

        //use a break statement in the for each list
        for (int i = 0; i < 10; i++){
            if (i == 7)
                break;
            System.out.println(i);
        }


        /*
        // all cases will be executed until the break keyword
        int a = 0;
        switch (a) {
            case 0 :
                System.out.println("Hi!");
            case 1:
                System.out.println("Hello!");
                break;
        }
         */
    }
}
