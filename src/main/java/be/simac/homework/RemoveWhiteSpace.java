package be.simac.homework;

/**
 * Created by Mschneider on 23-05-17.
 */
public class RemoveWhiteSpace {
    /**
     *
     * @param text text where white space needs to be removed
     * @return text without white spaces
     */
    public static String removeWhiteSpace(String text) {
        if (text != null) {
            return text.replaceAll(" ", "");
        } else {
            return "";
        }
    }
}
