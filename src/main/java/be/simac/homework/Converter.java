package be.simac.homework;

/**
 * Created by Mschneider on 22-05-17.
 */
public class Converter {
    /**
     *
     * @param number take as paprameter any number to be converted
     * @return the number into a string
     * @throws MyException if paramater isn't an number throw an exception
     */
    public static String numberToString(Object number) throws MyException {
        if(number==null){
            return "";
        }
        else if(number.getClass().getName()=="String"){
            return number.toString();
        }
        else if(!(number instanceof Number)){
            throw new MyException("Please enter a number");
        }
        else{
            String transform=String.valueOf(number);
            return transform;
        }
    }

}
