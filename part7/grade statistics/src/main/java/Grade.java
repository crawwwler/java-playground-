
import java.util.*;

public class Grade {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public Grade() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGrade(int point) {
        this.grades.add(this.pointsToGrade(point));
        this.points.add(point);

    }

    public int getNumberOfGrades(int n) {
        int count = 0;
        for (Integer x : this.grades) {
            if (x == n) {
                count++;
            }
        }
        return count;
    }

    public int pointsToGrade(int point) {
        int grade = 0;
        if (point < 50) {
            grade = 0;
        } else if (point < 60) {
            grade = 1;
        } else if (point < 70) {
            grade = 2;
        } else if (point < 80) {
            grade = 3;
        } else if (point < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        return grade;
    }

    public double pointsAverage() {
        int sum = 0;
        for (Integer x : this.points) {
            sum = sum + x;
        }
        return (double) sum / this.points.size();
    }

    public double passedAverage() {
        int sum = 0;
        int count = 0;
        for (Integer x : this.points) {
            if (x >= 50) {
                sum = sum + x;
                count++;
            }
        }
        return (double) sum / count;
    }

    public double passedPercentage() {
        int count = 0;
        for (Integer x : this.points) {
            if (x >= 50) {
                count++;
            }
        }
        return 100.0 * count / this.points.size();
    }

}
