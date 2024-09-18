package utils;

public class Utils {
    public static boolean isValid(String numeric, int length) {
        return numeric.length() == length && numeric.matches("[0-9]+");
    }
}