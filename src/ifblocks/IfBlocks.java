package ifblocks;

public class IfBlocks {

    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {

            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score is : " + finalScore);
            return finalScore;
        }
        System.out.println("Game Over");
            return -1;
        }

    }




