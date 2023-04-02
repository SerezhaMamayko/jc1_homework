package part2;

import java.util.Scanner;

public class Task12
{
    public static void main(String[] args) {
        String [] weekend = {
                "Понедельник: Работа",
                "Вторник: Бар",
                "Среда: Зал",
                "Четверг: Бассейн",
                "Пятница: Боулинг",
                "Суббота: Огород",
                "Воскресенье: Клуб",
        };
        for (String elem: weekend){
            System.out.println(elem);
        }
        System.out.println("Введите день недели, который хотите выбрать");
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        schedule(d,weekend);
    }
    static void schedule (int a, String[] b){

        switch (a){
            case 1:
                System.out.println(b[0]);
                break;
            case 2:
                System.out.println(b[1]);
                break;
            case 3:
                System.out.println(b[2]);
                break;
            case 4:
                System.out.println(b[3]);
                break;
            case 5:
                System.out.println(b[4]);
                break;
            case 6:
                System.out.println(b[5]);
                break;
            case 7:
                System.out.println(b[6]);
                break;
            default:
                System.out.println("Неправильный день недели");
                break;
        }
    }
}
