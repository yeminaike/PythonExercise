package Chapter7Assignment;

public class ReverseOrder {

    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println("The original array is: ");

        for (int number : numbers) {
            System.out.print(number);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("The reverse array is: ");
        for (int i= numbers.length-1; i >=0; i--){
            System.out.print(numbers[i]);
            System.out.print(" ");
        }

    }
}




