import java.util.ArrayList;

public class ChatServer implements Subject {

    private ArrayList<Observer> observers = new ArrayList<>();
    private ChatMessage message = new ChatMessage();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.getNotification(message);
        }
        System.out.println("****************************************************************************************");
    }

    public void sendMessage(ChatMessage message){
        this.message = message;
        notifyObservers();
    }
}
