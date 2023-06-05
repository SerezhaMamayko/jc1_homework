package part6.task39;

import java.util.Scanner;

public class Garage <T extends Vehicle>  {
    public String name;
    public String getName() {
        return name;
    }

    public void enterVeh (){
        System.out.println("Enter car or moto: ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
    }
}
