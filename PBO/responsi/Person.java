package responsi;
import java.util.Scanner;

public class Person {
    protected String name;
    protected String address;
    protected String hobi;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void hobi(String hobi) {
        System.out.println("Hobi " + name + ": " + hobi);
    }
}