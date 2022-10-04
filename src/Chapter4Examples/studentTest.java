package Chapter4Examples;

public class studentTest {

    public static void main(String[] args) {

        Student record = new Student("Yemoooo", 50);
        Student record2 = new Student("Bisi", 30);
        Student record3 = new Student("Ola", 100);

        System.out.printf("%s's letter Grade is: %s%n",
                record.getName(),record.getLetterGrade());

        System.out.printf("%s's letter Grade is: %s%n",
                record2.getName(), record2.getLetterGrade());

        System.out.printf("%s's letterGrade is: %s%n",
                record3.getName(), record3.getLetterGrade());


    }
}
