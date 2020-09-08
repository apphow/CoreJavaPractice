package ifblocks;

public class IfBlocks {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is : " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is : " + highScore);

        int highScorePosition = calculateHighScore(1000);
        displayHighScorePosition("Chelsea", highScorePosition);

        highScorePosition = calculateHighScore(950);
        displayHighScorePosition("Greg", highScorePosition);

        highScorePosition = calculateHighScore(890);
        displayHighScorePosition("Cameron", highScorePosition);

        highScorePosition = calculateHighScore(750);
        displayHighScorePosition("Parker", highScorePosition);

         highScorePosition = calculateHighScore(600);
        displayHighScorePosition("April", highScorePosition);

        highScorePosition = calculateHighScore(500);
        displayHighScorePosition("Brittany", highScorePosition);

    }

    public static void displayHighScorePosition(String name, int position) {

        System.out.println(name + " is in position " + position + " on the scoreboard");
    }

    public static int calculateHighScore(int playerScore) {

        /*
        if (playerScore >= 1000) {
            return 1;
            // if we get past first condition, less than 1000 is already true so
            // we don't need (playerScore>= 900 && playerScore < 1000)
        } else if (playerScore >= 900) {
            return 2;
        } else if (playerScore >= 800) {
            return 3;
        } else if (playerScore >= 700) {
            return 4;
        } else if (playerScore >= 600) {
            return 5;
        }
            return 6;
    }
         */

        int position = 6;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 900) {
            position = 2;
        } else if (playerScore >= 800) {
            position = 3;
        } else if (playerScore >= 700) {
            position = 4;
        } else if (playerScore >= 600) {
            position = 5;
        } else {
            position = 6;
        }
        return position;
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {

            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        System.out.println("Game Over");
            return -1;
        }

    }




