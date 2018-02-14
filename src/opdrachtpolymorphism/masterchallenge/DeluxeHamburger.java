package opdrachtpolymorphism.masterchallenge;

public class DeluxeHamburger {

    private boolean chips;
    private boolean drinks;

    private Hamburger hamburger;

    public DeluxeHamburger() {
        this.chips = chips;
        this.drinks = drinks;
        this.hamburger = new Hamburger("Deluxe Hamburger", true);
    }

    public void addChips(){
        this.chips = true;
        hamburger.addByTotalPrice(0.60);
    }

    public void addDrinks(){
        this.drinks = true;
        hamburger.addByTotalPrice(0.60);
    }


    public void basePriceTotalIs(){
        System.out.println("Delux -> " + hamburger.getTotalPriceToPay());

    }



}
