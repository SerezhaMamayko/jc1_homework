package part6.task37;

import part6.task36.YearSeasons;

public class Main {
    public static void main(String[] args) {
        showNextSeason();
    }
    public static void showNextSeason(){
        YearSeasons seasonsOfTheYear = new CheckInformation().checkSeason(new InputSeason().inputSeason());
        System.out.println("Next season: ");
        if (seasonsOfTheYear.ordinal() == YearSeasons.values().length - 1)
            System.out.println(YearSeasons.values()[0]);
        else
            System.out.println(YearSeasons.values()[seasonsOfTheYear.ordinal() + 1]);
    }
}
