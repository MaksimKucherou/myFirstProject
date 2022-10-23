package lessons.lesson3;

public class Rainbow {
    public static final String RED = "красный";
    public static final String ORANGE = "оранжевый";
    public static final String YELLOW = "желтый";
    public static final String GREEN = "зеленый";
    public static final String LIGHT_BLUE = "голубой";
    public static final String BLUE = "синий";
    public static final String PURPLE = "фиолетовый";
    public static final String DEFAULT = "совпадение не найдено";

    public String getColor(int colorNumber) {
        switch (colorNumber) {
            case 1:
                return RED;

            case 2:
                return ORANGE;

            case 3:
                return YELLOW;

            case 4:
                return GREEN;

            case 5:
                return LIGHT_BLUE;

            case 6:
                return BLUE;

            case 7:
                return PURPLE;

            default:
                return DEFAULT;
        }
    }
}
