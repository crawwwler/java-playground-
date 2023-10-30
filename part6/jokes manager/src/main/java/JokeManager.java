import java.util.ArrayList;
import java.util.*;

public class JokeManager {

    private ArrayList<String> jokeList;

    public JokeManager() {
        this.jokeList = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokeList.add(joke);
    }

    public String drawJoke() {
        Random draw = new Random();
        int d = 0;
        if (this.jokeList.size() == 0) {
            return "Jokes are in short supply.";
        } else {
            d = draw.nextInt(jokeList.size());
            return this.jokeList.get(d);
        }
    }

    public void printJokes() {
        for (String x : this.jokeList) {
            System.out.println(x);
        }
    }

}