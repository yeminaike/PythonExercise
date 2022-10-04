package Chapter4Examples;

import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
        // todo a small app like jumia that collects 10 valid scores and output sum

        int scoreCount = 0;
        Scanner scanner = new Scanner(System.in);


        // todo do all of these till scoreCount = 10
        int totalScore = 0;
        while (scoreCount != 10) {
            // todo collect scores
            System.out.println("Enter a score  " + (scoreCount + 1));

            int score = scanner.nextInt();

            // todo check if score is valid
            if (score >= 0 && score <= 100) {
                totalScore += score;
                scoreCount++;
            }

        }
        System.out.println("Total score id  " + totalScore);
    }
}
