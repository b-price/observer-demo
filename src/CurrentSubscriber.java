public class CurrentSubscriber implements Subscriber{
    private String name;
    private int points;
    public CurrentSubscriber(String name){
        this.name = name;
        points = 0;
    }

    public String getName(){
        return name;
    }

    @Override
    public void update(String message) {
        points++;
        System.out.println(name + " has been sent " + message + ".");
        System.out.println(name + "'s current points: " + points);
    }
}
