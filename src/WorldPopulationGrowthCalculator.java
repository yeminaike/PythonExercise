import java.util.Scanner;

public class WorldPopulationGrowthCalculator {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        System.out.print("Enter the current world population");
        double cwp = input.nextDouble();

        System.out.print("Enter the annual world population growth rate");
        double growthRate= input.nextDouble();
        growthRate = growthRate/100;

        


    }
}
