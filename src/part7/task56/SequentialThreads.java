package part7.task56;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SequentialThreads {
    private static final Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread(SequentialThreads::printThreadName);
            thread.start();
        }
    }

    private static void printThreadName() {
        lock.lock();

        try {
            System.out.println("Thread: " + Thread.currentThread().getName());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } finally {
            lock.unlock();
        }
    }
}