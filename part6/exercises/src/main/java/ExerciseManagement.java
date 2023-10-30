
import java.util.*;

public class ExerciseManagement {
    
    private ArrayList<Exercise> exercises;
    
    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }
    
    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise x : exercises) {
            list.add(x.getName());
        }
        return list;
    }
    
    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }
    
    public void markAsCompleted(String ex) {
        for (Exercise x : exercises) {
            if (x.getName().equals(ex)) {
                x.setDone(true);
            }
        }
    }
    
    public boolean isCompleted(String ex) {
        for (Exercise x : exercises) {
            if (x.getName().equals(ex)) {
                return x.isDone();
            }
        }
        return false;
    }
}
