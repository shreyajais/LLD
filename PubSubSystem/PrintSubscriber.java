package LLD.PubSubSystem;

public class PrintSubscriber implements Subscriber{
    private final String name;

    public PrintSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void onMessage(Message message) {
        System.out.println("print the name with message" + name + message.getMessage());
    }
}
