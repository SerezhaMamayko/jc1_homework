package part6.task36;

public enum YearSeasons {
    WINTER("Cold", 90),
    SPRING("Not very cold", 92),
    SUMMER("Hot", 92),
    AUTUMN("Not very hot", 91);

    private final String description;
    private final int countOfDays;

    YearSeasons(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public static void Display() {
        System.out.println("Сезоны:");
        for (YearSeasons seasons : YearSeasons.values()) {
            System.out.println(seasons + ". Description: " + seasons.getDescription() + ". Count of days: " + seasons.getCountOfDays());
        }
    }
}
