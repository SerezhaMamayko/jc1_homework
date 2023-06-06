package part7.task54;

public class NewThread implements Runnable{

    Thread th;

    public NewThread() {
        th = new Thread(this);
    }

    @Override
    public void run() {
        int max = 0;
        int[] arr = new int[10];
        for (int i = 0; i< arr.length; i++ ) {
            arr[i] = (int) (Math.random() * 100);
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("name of thread:" + th.getName()+ ", max element is "+ max );
    }
    void start(){
        th.start();
    }
    public void getName() {
        th.getName();
    }
}
