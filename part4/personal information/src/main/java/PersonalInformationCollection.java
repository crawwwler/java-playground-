
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("First name:");
            String firstName = scanner.nextLine();
            System.out.println("");
            
            if (firstName.isEmpty()) {
                break;
            }

            System.out.print("Last name:");
            String lastName = scanner.nextLine();
            System.out.println("");
            
            System.out.print("Identification number:");
            String idNum = scanner.nextLine();
            System.out.println("");
            
            infoCollection.add(new PersonalInformation(firstName, lastName, idNum));

        }
        System.out.println("");
        
        for (int i = 0; i < infoCollection.size(); i++) {
            
            System.out.println(infoCollection.get(i).getFirstName() + " " + infoCollection.get(i).getLastName());
        }

    }

}
