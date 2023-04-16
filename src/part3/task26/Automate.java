package part3.task26;

import java.util.Scanner;

public class Automate {
    public int hundredCount;
    public int fiftyCount;
    public int twentyCount;

    public Automate (int hundredCount, int fiftyCount, int twentyCount){
        this.hundredCount = hundredCount;
        this.fiftyCount = fiftyCount;
        this.twentyCount = twentyCount;
    }
    public void printMoneyCount (){
        System.out.println("Соток " + hundredCount);
        System.out.println("Пятьдесяток " + fiftyCount);
        System.out.println("Двадцаток " + twentyCount);
    }
    public int readBalance (){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите сумму которую хотите снять");
        int balance = scanner.nextInt();
        boolean isNumberCorrect;
        do {
            isNumberCorrect = balance % 10 == 0 && balance != 10 && balance != 30;
            if (isNumberCorrect){
                System.out.println("Банкомат может выдать данную сумму" );
            }
            if (!isNumberCorrect) {
                System.out.println("Введите более корректную сумму ");
                balance = scanner.nextInt();
            }
        } while (!isNumberCorrect);
        return balance;
    }
    public void moneyOutput (int balance){
        int hundredCountOutput = 0; int fiftyCountOutput = 0; int twentyCountOutput = 0;
        while (balance != 0){
            while (balance - 100 >= 20 && hundredCount != 0){
                balance = balance - 100;
                hundredCount--;
                hundredCountOutput++;
            }
            if (balance - 100 == 0 && hundredCount != 0){
                balance = 0;
                hundredCount--;
                hundredCountOutput++;
            }
            while ( ((balance / 2) %10 == 5 || balance - 100 >= 0)  && fiftyCount != 0){
                balance = balance - 50;
                fiftyCount--;
                fiftyCountOutput++;
            }
            while (balance - 20 >=0 && twentyCount != 0){
                balance = balance - 20;
                twentyCount--;
                twentyCountOutput++;
            }
            System.out.println("Купюр по сто: " + hundredCountOutput);
            System.out.println("Купюр по пятьдесят: " + fiftyCountOutput);
            System.out.println("Купюр по двадцать: " + twentyCountOutput);
        }
    }
    public void moneyInput (){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите купюру, которую хотите положить: ");
        int count;
        int num = scanner.nextInt();
        boolean isNumberCorrect;
        do {
            isNumberCorrect = num == 20  || num == 50 || num == 100;
            if (isNumberCorrect){
                System.out.println("Вы можете внести данную купюру" );
            }
            if (!isNumberCorrect) {
                System.out.println("Введите верную купюру");
                num = scanner.nextInt();
            }
        } while (!isNumberCorrect);
        if (num == 100){
                System.out.println("Введите количество купюр, которое хотите добавить ");
                count = scanner.nextInt();
                hundredCount +=count;
            System.out.println("Новое значение соток: " + hundredCount);
        }
        if (num == 50){
                System.out.println("Введите количество купюр, которое хотите добавить ");
                count = scanner.nextInt();
                fiftyCount +=count;
            System.out.println("Новое значение пятьдесяток: " + fiftyCount);
        }
        if (num == 20){
                System.out.println("Введите количество купюр, которое хотите добавить ");
                count = scanner.nextInt();
                twentyCount +=count;
            System.out.println("Новое значение двадцаток: " + twentyCount);
        }
    }
}
