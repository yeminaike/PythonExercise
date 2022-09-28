import java.util.Arrays;
import java.util.Scanner;

public class BMICalculator {

    int weightInPounds;
    int heightInInches;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the user's weight in pounds");
        int weightInPounds = input.nextInt();

        System.out.print("Enter the user's height in inches");
        int heightInInches = input.nextInt();

        int BMI =  weightInPounds * 703  / (heightInInches * heightInInches);
        System.out.printf("My BMI is %d%n", BMI);

    }



}
