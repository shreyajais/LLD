package LLD.PubSubSystem;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private final String name;
    private List<Topic> topicList;

    public Publisher(String name) {
        this.name = name;
        this.topicList = new ArrayList<>();
    }

    public void registerTopic(Topic topic){
        this.topicList.add(topic);
    }

    public void publish(Message message){
        for(Topic topic: topicList){
            topic.publish(message);
        }
    }
    public void publishTopic(Topic topic, Message message){
        if(!this.topicList.contains(topic)){
            System.out.println("Topic not found");
        } else topic.publish(message);
    }
}
