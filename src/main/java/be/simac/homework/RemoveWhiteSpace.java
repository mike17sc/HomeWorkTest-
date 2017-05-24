package be.simac.homework;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Mschneider on 23-05-17.
 * Class to remove white spaces
 */
public class RemoveWhiteSpace {
    /**
     * @param text text where white space needs to be removed
     * @return text without white spaces
     */
    public static String removeWhiteSpace(String text) {
        return StringUtils.deleteWhitespace(text);
    }
}
