
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (this.meals.contains(meal)) {
            return;
        } else {
            this.meals.add(meal);
        }
    }

    public void printMeals() {
        for (String x : this.meals) {
            System.out.println(x);
        }
    }

    public void clearMenu() {
        this.meals.clear();

    }

}
