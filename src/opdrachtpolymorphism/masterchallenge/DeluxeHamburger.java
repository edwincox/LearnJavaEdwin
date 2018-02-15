package opdrachtpolymorphism.masterchallenge;

public class DeluxeHamburger extends Hamburger {

    private double CHIPS_PRICE = 1.05;
    private double DRINK_PRICE = 1.25;

    public DeluxeHamburger(String breadRollType, boolean meat, double price) {
        super(breadRollType, meat, price);
    }

    @Override
    public double calculateTotalPrice() {
        return super.calculateTotalPrice() + CHIPS_PRICE + DRINK_PRICE;
    }

    @Override
    public void printAllOrderd() {
        System.out.println("Chips price: " + getCHIPS_PRICE());
        System.out.println("Drink price: " + getDRINK_PRICE());
        super.printAllOrderd();
    }

    public double getCHIPS_PRICE() {
        return CHIPS_PRICE;
    }

    public double getDRINK_PRICE() {
        return DRINK_PRICE;
    }
}