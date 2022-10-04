package Chapter2Exercises;

import java.util.Scanner;

public class WorldPopulation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int populationCounter = 1;
//        int currentWorldPopulation = 0;
//        int populationGrowthRate = 0;

        System.out.println("Enter the current world Population");
        long currentWorldPopulation = input.nextLong();

        System.out.println("Enter the population growth rate: ");
        double populationGrowthRate = input.nextDouble();

        System.out.printf("%14s%25s%n", "Year", "Estimate");

        while (populationCounter <= 5) {
            currentWorldPopulation += populationGrowthRate * currentWorldPopulation / 100;
            if (populationCounter == 1) {
                System.out.printf("After %d year:  ", populationCounter);
                System.out.printf("The current estimated population is %d%n", currentWorldPopulation);

            }
            else {
                System.out.printf("After %d years: ", populationCounter);
                System.out.printf("The current estimated population is %d%n", currentWorldPopulation);

            }
            populationCounter = populationCounter + 1;
            }
        }
    }

