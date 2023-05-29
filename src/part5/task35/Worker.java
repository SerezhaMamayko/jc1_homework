package part5.task35;

public class Worker extends Staff{
    public Worker () {
        super();
    }
    Double hour = 8.0;

    @Override
    Double setWage() {
         return wage * this.hour;
    }
    String getPost () {
        return "Worker";
    }
}
