package part6.task37;

import part6.task36.YearSeasons;

public class CheckInformation {
    public boolean checkInformation(String yearSeason){
        if (yearSeason.length() == 0 || yearSeason == null) {
            System.out.println("Wrong answer");
            return false;
        }
        return true;
    }

    public YearSeasons checkSeason(String yearSeason){
        checkInformation(yearSeason);
        switch (yearSeason){
            case "summer": return YearSeasons.SUMMER;
            case "winter": return YearSeasons.WINTER;
            case "spring": return YearSeasons.SPRING;
            case "autumn": return YearSeasons.AUTUMN;
            default:
                System.out.println("Wrong answer");
                System.exit(1);
                return null;
        }
    }
}
