package Chapter7Examples;

public class SumArrayTest {
    public static void main(String[] args) {

        int [] numbers = { 1, 5, 5, 3};
        ArrayMethod arrayMethod = new ArrayMethod();
        arrayMethod.addNumbers(numbers);
        System.out.println("The sum of the is" + arrayMethod.addNumbers(numbers));

        System.out.printf("%d", arrayMethod.addNumbers(numbers));

    }
}
