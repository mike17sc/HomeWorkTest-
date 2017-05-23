package be.simac.homework;

/**
 * Created by Mschneider on 22-05-17.
 */
public class Converter {
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
