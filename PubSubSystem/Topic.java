package LLD.PubSubSystem;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    private final String name;
    private List<Subscriber> subscriberList;

    public Topic(String name) {
        this.name = name;
        this.subscriberList = new ArrayList<>();
    }

    public void addSubscriber(Subscriber subscriber){
        this.subscriberList.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber){
        this.subscriberList.remove(subscriber);
    }

    public synchronized void publish(Message message){
        for(Subscriber subscriber: this.subscriberList){
            subscriber.onMessage(message);
        }
    }
}
