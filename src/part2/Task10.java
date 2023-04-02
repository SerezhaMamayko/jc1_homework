package part2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите день:");
        int d = scanner.nextInt();
        System.out.println("Введите месяц:");
        int m = scanner.nextInt();
        System.out.println("Введите год:");
        int y = scanner.nextInt();
        { if (d==31&&m==12)
            System.out.println ("Завтра 01.01." + (y+1));
        else { if ((d==31&&(m==1||m==3||m==5||m==7||m==8||m==10))||(d==30&&(m==4||m==6||m==9||m==11))||(d==29&&m==2&&y%4==0)||(d==28&&m==2&&y%4!=0))
            System.out.println ("Завтра 01." + (m+1) + "." + y);
        else { if ((d==31&&(m==4||m==6||m==9||m==11))||(d>29&&m==2)||(d==29&&m==2&&y%4!=0))
            System.out.println ("Неправильная дата");
        else
            System.out.println ("Завтра " + (d+1) + "." + m + "." + y);
        }
        }
        }
    }
}