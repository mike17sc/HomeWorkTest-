package be.simac.homework;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import java.util.*;

/**
 * Created by Mschneider on 23-05-17.
 */

public class SortClientTest {
    @Test
    public void sortClientTest(){
        List<Client> list=new ArrayList<>();
        list.add(new Client("Mike",19));
        list.add(new Client("Annick",36));
        list.add(new Client("Mike",6));
        list=SortClient.sortClient(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getName() + list.get(i).getAge());
        }
    }
}
