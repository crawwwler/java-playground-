
import java.util.*;

public class UI {

    private Scanner scanner;
    private Grade grades;

    public UI(Scanner scanner, Grade grades) {
        this.scanner = scanner;
        this.grades = grades;
    }

    public void start() {
        readInput();
        printResults();
        printDistribution();
    }

    public void readInput() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            String input = scanner.nextLine();
            int adad = Integer.valueOf(input);

            if (adad == -1) {
                break;
            }
            if (adad < 0 || 100 < adad) {
                continue;
            }

            grades.addGrade(adad);
        }
    }

    public void printResults() {
        System.out.println("Point average (all): " + grades.pointsAverage());
        System.out.println("Point average (passing): " + grades.passedAverage());
        System.out.println("Pass percentage: " + grades.passedPercentage());
    }

    public void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }

    public void printDistribution() {
        System.out.println("Grade distribution:");
        
        int grade = 5;
        while (grade >= 0) {
            int stars = grades.getNumberOfGrades(grade);
            System.out.print(grade + ":");
            printStars(stars);
            System.out.println("");
            grade--;
        }
    }
}
