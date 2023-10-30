
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();
        TextUI xx = new TextUI(ss, dictionary);
        
        xx.start();
                
    }
}
