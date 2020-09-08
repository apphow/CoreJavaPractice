package ifblocks;

public class IfBlocks {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 200;
        int levelCompleted = 8;
        int bonus = 100;

        if(score >= 5000) {
            System.out.println("Your score is >= to 5000");
        } else if(score < 1000 && score >= 500) {
            System.out.println("Your score is < 100 but >= 500");
        } else {
            System.out.println("Your score is < 500");
        }



    }
}
