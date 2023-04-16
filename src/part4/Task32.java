package part4;

public class Task32 {
    public static void main(String[] args) {
        long time1 = System.nanoTime();
        String str1 = "aaabbbccc";
        String str2 = " ";
        for (int i = 0; i<100000; i++){
            str2 += str1;
        }
        long time2 = System.nanoTime();
        long t = time1 - time2;
        StringBuilder st2 = new StringBuilder();
        long t1 = System.nanoTime();
        st2.append(str1.repeat(100000));
        long t2 = System.nanoTime();
        long tt = t2 - t1;
        System.out.println(tt - t);
    }
}
