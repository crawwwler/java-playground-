
public class Exercise {

    private String name;
    private boolean done;
    
    public Exercise(String name){
        this.name = name;
        this.done = false;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setDone(boolean done){
        this.done = done;
    }
    
    public boolean isDone(){
        return done;
    }
}
