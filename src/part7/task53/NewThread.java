package part7.task53;

import java.util.ArrayList;
import java.util.List;

public class NewThread implements Runnable{
    Thread t;
    public NewThread() {
        t = new Thread(this);
    }
    @Override
    public void run() {
        List<Integer> list = new ArrayList<>();
        double d = 0;
        for (int i = 0; i < 10; i++) {
            int randomGrade = (int) (Math.random() * 10000);
            list.add(randomGrade);
            d =+ randomGrade;
        }
        System.out.println((int)d/list.toArray().length);
    }
    void start() {
        t.start();
    }
}