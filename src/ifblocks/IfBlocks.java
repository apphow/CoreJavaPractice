package ifblocks;

public class IfBlocks {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 8;
        int bonus = 100;
/*
        if(score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if(score < 1000) {
            System.out.println("your score was less than 1000");
        }

        else{
            System.out.println("Got here");
        }

 */
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        boolean newGameOver = true;
        int newScore = 1000;
        int newLevelCompleted = 10;
        int newBonus = 200;

        if(newGameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your score is now " + finalScore);
        }


    }
}
