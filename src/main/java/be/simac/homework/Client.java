package be.simac.homework;

/**
 * Created by Mschneider on 23-05-17.
 */
public class Client {
    public  Client(String name,int age){
        this.age=age;
        this.name=name;
    }
    String name;
    int age;

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
    protected Object clone() throws CloneNotSupportedException {


    }
}