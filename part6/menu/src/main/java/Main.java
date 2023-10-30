
public class Main {

    public static void main(String[] args) {
        Menu exactum = new Menu();

        exactum.addMeal("kabab");
        exactum.addMeal("pizza");
        exactum.addMeal("abgoosht");
        exactum.addMeal("loobiapolo");

        exactum.printMeals();

        exactum.clearMenu();

        System.out.println("++++++++");

        exactum.addMeal("ghaza tamam shod!");
        exactum.printMeals();

    }
}
