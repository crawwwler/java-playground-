
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<Literacy> list = lCom("literacy.csv");
        Collections.sort(list);
        list.stream().forEach(i -> System.out.println(i));
    }
    
    public static ArrayList<Literacy> lCom(String fileName) {
        ArrayList<Literacy> list = new ArrayList<>();
        try {
            Files.lines(Paths.get(fileName))
                    .map(line -> line.split(","))
                    .map(parts -> new Literacy(parts[2].trim(), parts[3].trim(), Integer.valueOf(parts[4].trim()), Double.valueOf(parts[5].trim())))
                    .forEach(i -> list.add(i));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return list;
    }
}
