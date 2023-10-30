
import java.util.*;

public class Employees {

    private List<Person> list;

    public Employees() {
        this.list = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.list.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(p -> this.list.add(p));
    }

    public void print() {
        Iterator<Person> ite = this.list.iterator();

        while (ite.hasNext()) {
            System.out.println(ite.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> ite = this.list.iterator();

        while (ite.hasNext()) {
            Person x = ite.next();
            if (x.getEducation() == education) {
                System.out.println(x);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> ite = this.list.iterator();

        while (ite.hasNext()) {
            if (ite.next().getEducation() == education) {
                ite.remove();
            }
        }
    }
}
