package be.simac.homework;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
/**
 * Created by Mschneider on 23-05-17.
 */
public class RemoveWhiteSpaceTest {
    @Test
    public void testRemoveWhiteSpaceText(){
        String text="I'm a tester";
        String result=RemoveWhiteSpace.removeWhiteSpace(text);
        assertThat(result).isEqualTo("I'matester");
    }
    @Test
    public void testRemoveWhiteSpaceNull(){
        String text=null;
        String result=RemoveWhiteSpace.removeWhiteSpace(text);
        assertThat(result).isEqualTo("");
    }
}
