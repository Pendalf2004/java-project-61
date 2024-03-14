package hexlet.code;

public class Utils {
    public static int getRndNum(int min, int max) {
        return min + Math.toIntExact(Math.round(Math.random() * (max - min)));
    }
    public static int getRndNum(int max) {
        return Math.toIntExact(Math.round(Math.random() * max));
    }
    public static int getRndNum() {
        return Math.toIntExact(Math.round(Math.random() * 50));
    }
}
