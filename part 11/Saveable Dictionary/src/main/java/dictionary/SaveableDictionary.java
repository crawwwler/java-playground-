package dictionary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class SaveableDictionary {

    private Map<String, String> dic;
    private String file;

    public SaveableDictionary() {
        this.dic = new HashMap<>();
        this.file = null;
    }

    public SaveableDictionary(String filename) {
        this.dic = new HashMap<>();
        this.file = filename;
    }

    public void add(String word, String tl) {
        if (this.dic.containsKey(word)) {
        } else {
            this.dic.put(word, tl);
        }
    }

    public String translate(String word) {
        if (this.dic.containsKey(word)) {
            return this.dic.get(word);
        } else if (this.dic.containsValue(word)) {
            for (Map.Entry<String, String> entry : this.dic.entrySet()) {
                if (entry.getValue().equals(word)) {
                    return entry.getKey();
                }
            }
        }
        return null;
    }

    public void delete(String word) {
        if (this.dic.containsKey(word)) {
            this.dic.remove(word);
        } else if (this.dic.containsValue(word)) {
            Iterator<Map.Entry<String, String>> ite = this.dic.entrySet().iterator();
            while (ite.hasNext()) {
                Map.Entry<String, String> entry = ite.next();
                if (entry.getValue().equals(word)) {
                    ite.remove();
                }
            }
        }
    }

    public boolean load() {
        try {
            Files.lines(Paths.get(this.file))
                    .map(line -> line.split(":"))
                    .forEach(parts -> this.add(parts[0], parts[1]));
            return true;
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public boolean save() {
        try {
            try (PrintWriter writer = new PrintWriter(this.file)) {
                Iterator<Map.Entry<String, String>> ite = this.dic.entrySet().iterator();
                while (ite.hasNext()) {
                    Map.Entry<String, String> entry = ite.next();
                    writer.println(entry.getKey() + ":" + entry.getValue());
                }
            }
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }

}
