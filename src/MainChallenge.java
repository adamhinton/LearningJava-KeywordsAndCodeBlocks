public class MainChallenge {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 10_000;
        int levelCompleted = 8;
        int bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);

        calculateScore((true, 10000, 8, 200));
    }

    public static void calculateScore
            (boolean gameOver,
             int score,
             int levelCompleted,
             int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

    }
}