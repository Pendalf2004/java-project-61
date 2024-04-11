package hexlet.code;

public class Utils {
    private static final int DEFAULT_MAX_NUM = 100;
    public static int getRndNum(int min, int max) {
        return min + Math.toIntExact(Math.round(Math.random() * (max - min)));
    }
    public static int getRndNum(int max) {
        return Math.toIntExact(Math.round(Math.random() * max));
    }
    public static int getRndNum() {
        return Math.toIntExact(Math.round(Math.random() * DEFAULT_MAX_NUM));
    }
}
