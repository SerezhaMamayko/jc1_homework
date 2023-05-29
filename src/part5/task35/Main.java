package part5.task35;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Master master = new Master();
        Manager manager = new Manager();
        System.out.println("Post: " + worker.getPost() + " wage: " + worker.setWage());
        System.out.println("Post: " + master.getPost() + " wage: " + master.setWage());
        System.out.println("Post: " + manager.getPost() + " wage: " + manager.setWage());


    }
}
