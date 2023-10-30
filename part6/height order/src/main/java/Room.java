
import java.util.*;

public class Room {

    private ArrayList<Person> list;

    public Room() {
        this.list = new ArrayList<>();
    }

    public void add(Person person) {
        this.list.add(person);
    }

    public boolean isEmpty() {
        if (this.list.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.list;
    }

    public Person shortest() {
        if (this.isEmpty()) {
            return null;
        }

        Person midget = this.list.get(0);

        for (Person x : this.list) {
            if (midget.getHeight() > x.getHeight()) {
                midget = x;
            }
        }
        return midget;
    }

    public Person take() {
        if (this.isEmpty()) {
            return null;
        }
        Person xx = this.shortest();
        this.list.remove(this.shortest());
        return xx;
    }
}
