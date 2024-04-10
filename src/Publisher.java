import java.util.ArrayList;

public class Publisher {
    private String name;
    private ArrayList<Subscriber> subscribers;
    public Publisher(String name){
        this.name = name;
        subscribers = new ArrayList<Subscriber>();
    }

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void deleteSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Subscriber> getSubscribers(){
        return subscribers;
    }

    public void notify(String message){
        for (Subscriber sub: subscribers){
            sub.update(message);
        }
    }
}
