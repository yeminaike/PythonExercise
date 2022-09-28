//package Chapter5;
//
//import java.util.Scanner;
//
//public class StudentGradesAssignmentChibuzor {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//
//        int Excellent = 0;
//        int VeryGood = 0;
//        int average = 0;
//        int  pass = 0;
//        int fail = 0;
//        int count =0;
//        int  grade = 0;
//
//
//        for( count =1; count<=5; count++) {
//            System.out.println("Enter student name: ");
//            String student1 = input.nextLine();
//            String student2 = input.nextLine();
//            String student3 = input.nextLine();
//            String student4 = input.nextLine();
//            String student5 = input.nextLine();
//
//            System.out.println("Enter student's grades: ");
//            grade = input.nextInt();
//
//            switch (grade / 10) {
//                case 10, 9 -> ++Excellent;
//                case 8, 7 -> ++VeryGood;
//                case 6 -> ++average;
//                case 5 -> ++pass;
//                default -> ++fail;
//            }
//        }
//
//        if (count !=0) {
//            System.out.println("The number of students per grade:", ("A", "B", "C", "D", "E", "F");t
//            //meet peter for println of these statement
//        }
//        else {
//            System.out.print("no grades entered");
//
//        }
//
//             }
//        }
//
//
