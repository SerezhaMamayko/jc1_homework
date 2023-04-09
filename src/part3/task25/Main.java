package part3.task25;

public class Main {
    public static void main(String[] args) {
        Time t1 = new Time(5, 20, 30);
        Time t2 = new Time (6, 25, 34);
        Time t3 = new Time (24612);
        System.out.println(t1.getHour());
        System.out.println(t3.getSecond());
        t1.getAllTime();
        t3.getAllTime();
        System.out.println(t1.getAllTimeInSec());
        System.out.println(t2.compareTo(t1));
        System.out.println(t3.getAllTimeInSec());
        System.out.println(t1.compareTo(t3));
    }
}
