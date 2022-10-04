package Chapter7Examples;

public class ArrayMethod {
    //
//    public int addNumbers(int[] numbers) {
//        var total = 0;
//        for (int number : numbers) {
//            total = total + number;
//        }
//        return total;
//
//
//    }
    public int addNumbers(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}


