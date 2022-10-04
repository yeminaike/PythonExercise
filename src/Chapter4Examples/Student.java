package Chapter4Examples;

public class Student {

    private String name;
    private double average;


    public Student(String name, double average) {

        this.name = name;

        if (average > 0.0 && average <= 100.0) {
            this.average = average;

        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public Double getAverage() {
        return average;
    }

    public String getLetterGrade() {
        String letterGrade = " ";

        if (average >= 90.0) {
            letterGrade = ("A");
        } else if (average >= 80) {
            letterGrade = ("A");
        } else if (average >= 70) {
            letterGrade = ("B");
        } else if (average >= 60) {
            letterGrade =("B");
        } else if (average >= 50) {
            letterGrade =("C");
        } else if (average >= 40) {

            letterGrade =("D");
        } else {
            letterGrade =("He or she had an F. Advised to come back next year.");
        }

    return letterGrade;
    }
}
