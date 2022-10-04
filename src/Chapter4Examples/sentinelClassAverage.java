//package Chapter4Examples;
//
//import java.util.Scanner;
//
//public class sentinelClassAverage {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int total = 0;
//        int gradeCounter = 1;
//
//
//        System.out.println("Enter grade or -1 to quit");
//        int grade = input.nextInt();
//
//        while (grade != 1) {
//            total = total + grade;
//            gradeCounter = gradeCounter + 1;
//        }
//
//
//        double average = 0;
//        if (gradeCounter != 0) {
//            average = (double) total / gradeCounter;
//        }
//        System.out.printf("%nThe total of the %d grades is %d%n:", gradeCounter, total);
//        System.out.printf("Class average is %.2f%n", average);
//
//    }else {
//        System.out.println("no grades entered");
//    }
//
//}
//
//
//
//
//
//
