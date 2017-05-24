package be.simac.homework;

import org.omg.CORBA.Object;

/**
 * Created by Mschneider on 23-05-17.
 */
public class Client implements Comparable<Client>  {
    public Client(String name, int age) {
        this.age = age;
        this.name = name;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Client autreClient) {

        int compare= this.name.compareTo(autreClient.name);
        if(compare==0){
            return this.age - autreClient.age;
        }
        else{
            return compare;
        }
    }

}


