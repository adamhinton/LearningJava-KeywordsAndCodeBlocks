public class MainChallenge {
    public static final int BOB = 1000;

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10_000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }

}