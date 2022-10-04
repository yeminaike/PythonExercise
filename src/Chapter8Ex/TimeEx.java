package Chapter8Ex;

public class TimeEx {

    private int hour;
    private int minute;
    private int seconds;


    public TimeEx(){
        this(0 , 0 ,0);
    }

    public TimeEx(int hour){
        this(hour, 0, 0);
    }

    public TimeEx(int hour, int minute){
        this(hour, minute, 0);
    }

    public TimeEx(int hour , int minute, int seconds) {
        if((hour <0 || hour >= 24 || minute <0 || minute >= 60 || seconds <0 || seconds >= 60)) {
            throw new IllegalArgumentException("Hour or minutes or" + "seconds is out of range");
        }
    }
}
