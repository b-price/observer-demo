public class ObserverClient {
    public static void main(String[] args) {
        Publisher bigPub = new Publisher("Big Pub");
        LegacySubscriber sub1 = new LegacySubscriber("Joe");
        CurrentSubscriber sub2 = new CurrentSubscriber("Bob");

        bigPub.addSubscriber(sub1);
        bigPub.addSubscriber(sub2);

        bigPub.notify("hello");
        bigPub.notify("goodbye");
    }
}