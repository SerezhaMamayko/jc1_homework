package part5.task35;

public class Manager extends Staff{
    public Manager () {
        super();
    }
    Double hour = 6.0;
    Double coefficient = 2.0;

    public void setHour(Double hour) {
        this.hour = hour;
    }

    public void setCoefficient(Double coefficient) {
        this.coefficient = coefficient;
    }

    Double setWage () {
        return wage * hour * coefficient;
    }

    String getPost () {
        return "Manager";
    }
}
