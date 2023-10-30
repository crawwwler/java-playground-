
public class HealthStation {
    
    private int count = 0;

    public int weigh(Person person) {
        int w = person.getWeight();
        count++;
        return w;
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int weighings(){
        return count;
    }

}
