package Chapter4Examples;

import java.util.Scanner;

public class classAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0;
        double gradeCounter = 1;


        for (gradeCounter = 1; gradeCounter <= 10; gradeCounter++) {

            System.out.println("Enter Grade: ");
            double Grade = input.nextDouble();
            total = total + Grade;
            gradeCounter = gradeCounter + 1;

            double average = total / 10;

            System.out.printf("%nThe total of all the grades is %.2f%n:", total);
            System.out.printf("The Class average of the grades is %.2f%n:", average);
        }
    }
}


