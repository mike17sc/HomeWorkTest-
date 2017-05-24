package be.simac.homework;

import java.util.*;

/**
 * Created by Mschneider on 23-05-17.
 * Class to sort client list
 */
class SortClient {
    /**
     * @param listClient enter a list of client
     * @return list sorted
     * @throws MyException if list or list contain  null throw exception
     */
    public static List<Client> sortClient(List<Client> listClient) throws MyException {
        if (listClient == null) {
            throw new MyException("List can't be null");
        }
        for (Client aListClient : listClient) {
            if (aListClient == null) {
                throw new MyException("List can't contain null client");
            }
        }
        listClient.sort((clientOne, clientTwo) -> {
            int compare = clientOne.name.compareTo(clientTwo.name);
            if (compare == 0) {
                return clientOne.age - clientTwo.age;
            } else {
                return compare;
            }
        });
        return listClient;
    }
}
