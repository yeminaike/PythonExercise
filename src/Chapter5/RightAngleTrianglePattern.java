package Chapter5;

public class RightAngleTrianglePattern {

    public static void main(String[] args) {
       int counter = 10;

       for(int i =1; i<=counter; i++){
           for(int j =1; j<= i; j++){

               System.out.print("*");
               System.out.print(" ");
           }
           System.out.println();
       }

    }
}
