package part1;

public class Task2 {
    public static void main(String[] args) {
        int s = 1000008;
        int sec;
        int m;
        int min, h;
        sec = s % 60;
        m = (s-sec) / 60;
        min = m % 60;
        h = (m-min) / 60;
        // System.out.print(h + " " + min + " " + sec + " ");
        int hour;
        int d, days, w;
        hour = h % 24;
        d = (h-hour) / 24;
        days = d % 7;
        w = (d-days) / 7;
        System.out.print(w + " недель " + days + " дней " + hour + " часов " + min + " минут " + sec + " секунд ");

    }
}
