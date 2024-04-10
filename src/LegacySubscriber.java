public class LegacySubscriber implements Subscriber{
    private String name;
    public LegacySubscriber(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " has been sent " + message + ".");
    }
}
