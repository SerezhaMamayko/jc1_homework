package part3.task16;

public final class Time {

    private final int hour;
    private final int minute;
    private final int second;



    public Time (int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time (int second){
        this.hour = 0;
        this.minute = 0;
        this.second = second;
    }

    public int getHour() {
        if (hour != 0 && minute != 0){
        return hour;
        }
        else {
            int sec;
            int m;
            int min, h;
            sec = second % 60;
            m = (second-sec) / 60;
            min = m % 60;
            h = (m-min) / 60;
            return h;
        }
    }

    public int getMinute() {
        if (hour != 0 && minute != 0){
            return minute;
        }
        else {
            int sec;
            int m, min;
            sec = second % 60;
            m = (second-sec) / 60;
            min = m % 60;
            return min;
        }
    }

    public int getSecond() {
        if (hour != 0 && minute != 0){
        return second;
        }
        else {
            int sec;
            sec = second % 60;
            return sec;
        }
    }
    public void getAllTime (){
        if (hour != 0 && minute !=0){
        System.out.println(hour + " часов " + minute + " минут " + second + " секунд ");
        }
        else {
            int sec;
            int m;
            int min, h;
            sec = second % 60;
            m = (second-sec) / 60;
            min = m % 60;
            h = (m-min) / 60;
            System.out.println(h + " часов " + min + " минут " + sec + " секунд ");
        }
    }
    public int getAllTimeInSec (){
        if (hour != 0 && minute != 0) {
            return (hour * 60 + minute) * 60 + second;
        } else {
            return second;
        }
    }
    public int compareTo (Time time){
        return Integer.compare((this.hour * 60 + this.minute)*60 + this.second, (time.getHour()*60 + time.getMinute())*60 + time.getSecond());
    }
}