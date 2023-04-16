package part3.task26;

public class Main {
    public static void main(String[] args) {
            Automate automate = new Automate(110, 50, 20);
            automate.printMoneyCount();
            int balance = automate.readBalance();
            automate.moneyOutput(balance);
            automate.moneyInput();

    }
}
