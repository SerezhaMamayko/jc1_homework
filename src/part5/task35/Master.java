package part5.task35;

public class Master extends Staff{
    public Master () {
        super();
    }
    Double coefficient = 10.0;


    @Override
    Double setWage() {
        return wage * coefficient;
    }

    String getPost (){
        return "Master";
    }
}
