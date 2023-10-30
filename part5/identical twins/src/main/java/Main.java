
public class Main {

    public static void main(String[] args) {

        SimpleDate date = new SimpleDate(24, 3, 2017);

        Person leo = new Person("Leo", date, 62, 9);
        Person lily = new Person("Leo", date, 62, 9);

        if (leo.equals(lily)) {
            System.out.println("Is this quite correct?");
        } else {
            System.out.println("?");
        }
    }
}
