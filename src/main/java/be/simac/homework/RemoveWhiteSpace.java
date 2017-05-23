package be.simac.homework;

/**
 * Created by Mschneider on 23-05-17.
 */
public class RemoveWhiteSpace {
    public static String removeWhiteSpace(String text) {
        if (text != null) {
            return text.replaceAll(" ", "");
        } else {
            return "";
        }
    }
}
