
public class Person {

    private String name;
    private String address;

    public Person(String n, String a) {
        this.name = n;
        this.address = a;
    }

    public String toString() {
        return this.name + "\n" + "  " + this.address;
    }
}
