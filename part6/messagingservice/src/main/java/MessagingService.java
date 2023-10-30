
import java.util.*;

public class MessagingService {

    private ArrayList<Message> ms;

    public MessagingService() {
        this.ms = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            this.ms.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return this.ms;
    }
}
