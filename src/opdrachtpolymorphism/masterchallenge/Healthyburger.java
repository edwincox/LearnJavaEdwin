package opdrachtpolymorphism.masterchallenge;

public class Healthyburger extends Hamburger{

    private boolean egg;
    private boolean bacon;


    public Healthyburger(String breadRollType, boolean meat) {
        super(breadRollType, meat);
    }

    public void addEgg(){
        this.egg = true;
        addByTotalPrice(0.75);
    }

    public void addBacon(){
        this.bacon = true;
        addByTotalPrice(0.75);
    }


}
