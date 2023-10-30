
import java.util.*;

public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary finnishOxford;
    
    public TextUI(Scanner scanner, SimpleDictionary fo) {
        this.scanner = scanner;
        this.finnishOxford = fo;
    }
    
    public void start() {
        
        while (true) {
            
            System.out.println("Command: ");
            String box = this.scanner.nextLine();
            
            if (box.equals("end")) {
                break;
            }
            
            if (box.equals("add")) {
                System.out.println("Word:");
                String word = this.scanner.nextLine();
                System.out.println("Translation:");
                String translation = this.scanner.nextLine();
                
                this.finnishOxford.add(word, translation);
                
                continue;
            }
            
            if (box.equals("search")) {
                System.out.println("To be translated:");
                String translated = this.scanner.nextLine();
                
                if (this.finnishOxford.contain(translated)) {
                    System.out.println("Translation: " + this.finnishOxford.translate(translated));
                } else {
                    System.out.println("Word " + translated + " was not found");
                }
                
                continue;
            }
            
            System.out.println("Unkown Command");
        }
        
        System.out.println("Bye bye!");
    }
}
