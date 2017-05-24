package be.simac.homework;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

/**
 * Created by Mschneider on 23-05-17.
 */

public class SortClientTest {
    /**
     * add stadard input 3 names with 3 ages
     *
     * @throws MyException
     */
    @Test
    public void sortClientTest() throws MyException {
        List<Client> list = new ArrayList<>();
        list.add(new Client("Mike", 19));
        list.add(new Client("Annick", 36));
        list.add(new Client("Mike", 6));
        list = SortClient.sortClient(list);
        assertThat(list.get(0).getName()).isEqualTo("Annick");
        assertThat(list.get(1).getName()).isEqualTo("Mike");
        assertThat(list.get(1).getAge()).isEqualTo(6);
        assertThat(list.get(2).getName()).isEqualTo("Mike");
        assertThat(list.get(2).getAge()).isEqualTo(19);
    }

    @Test
    /**
     * Try with a list = null that should throw an exception
     */
    public void sortClientNullListTest() throws MyException {
        List<Client> list = null;
        try {
            list = SortClient.sortClient(list);
        } catch (MyException e) {
            assertThat(e).hasMessage("List can't be null");
        }
    }

    /**
     * try with an element of the list = null
     * @throws MyException
     */
    @Test
    public void sortClientNullClientTest() throws MyException {
        List<Client> list = new ArrayList<>();
        list.add(null);
        list.add(new Client("Annick", 36));
        list.add(new Client("Mike", 6));
        try {
            list = SortClient.sortClient(list);
        } catch (MyException e) {
            assertThat(e).hasMessage("List can't contain null client");
        }
    }
}
