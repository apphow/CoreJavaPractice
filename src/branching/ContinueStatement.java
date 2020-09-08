package branching;

public class ContinueStatement {

    public static void main(String[] args) {


        // continue statement in for loop
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0)
                continue;
            //execution of the print statement is skipped
            // and control of the program jumps to the end of the look.
            //
            System.out.println(i);

        }
    }
}
