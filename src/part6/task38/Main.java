package part6.task38;

import part6.task36.YearSeasons;
import part6.task37.CheckInformation;
import part6.task37.InputSeason;

public class Main {
    public static void main(String[] args) {
        showCountOfDays();
    }

    public static void showCountOfDays(){
        YearSeasons seasonsOfTheYear = new CheckInformation().checkSeason(new InputSeason().inputSeason());
        System.out.println("Count of days "+ seasonsOfTheYear + " — " + seasonsOfTheYear.getCountOfDays());
    }
}
