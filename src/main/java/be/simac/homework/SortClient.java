package be.simac.homework;

import java.util.*;

/**
 * Created by Mschneider on 23-05-17.
 */
public class SortClient {
    public static List<Client> sortClient(List<Client> listClient) throws MyException {
        if (listClient == null) {
            throw new MyException("List can't be null");
        }
        for (int i = 0; i < listClient.size(); i++) {
            if (listClient.get(i) == null) {
                throw new MyException("List can't contain null client");
            }
        }
        Collections.sort(listClient, new Comparator<Client>() {
            @Override
            public int compare(Client clientOne, Client clientTwo) {
                int compare = clientOne.name.compareTo(clientTwo.name);
                if (compare == 0) {
                    return clientOne.age - clientTwo.age;
                } else {
                    return compare;
                }
            }
        });
        return listClient;
    }
}
