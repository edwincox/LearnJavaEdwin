package opdrachtpolymorphism.masterchallenge;

public class Healthyburger extends Hamburger{

    public static final double EGG_PRICE = 0.05;
    public static final double BACON_PRICE = 0.95;
    private int numberOfEgg = 0;
    private int numberOfBacon = 0;

    public Healthyburger(String breadRollType, boolean meat, double price) {
        super(breadRollType, meat, price);
    }


    @Override
    public double calculateTotalPrice() {
        return super.calculateTotalPrice() + (numberOfEgg * EGG_PRICE) + (numberOfBacon * BACON_PRICE);
    }

    @Override
    public void printAllOrderd() {
        super.printAllOrderd();
        System.out.println("Total egg: " + getNumberOfEgg());
        System.out.println("Total bacon: " + getNumberOfBacon());

    }

    public void addEgg(){
        numberOfEgg++;
    }

    public void addBacon(){
        numberOfBacon++;
    }

    public int getNumberOfEgg() {
        return numberOfEgg;
    }

    public int getNumberOfBacon() {
        return numberOfBacon;
    }
}
