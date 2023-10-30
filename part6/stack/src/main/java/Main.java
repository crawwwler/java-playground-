
public class Main {

    public static void main(String[] args) {

        Stack x = new Stack();
        
        System.out.println(x.isEmpty());
        x.add("try harder");
        x.add("dont give up");
        x.add("youll make it");
        x.add("fuck depression");
        
        System.out.println(x.values());
        x.add("yeeeep");
        
        System.out.println(x.take());
        System.out.println(x.values());
    }
}
