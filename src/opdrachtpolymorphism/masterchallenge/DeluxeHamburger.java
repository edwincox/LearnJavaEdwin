package opdrachtpolymorphism.masterchallenge;

public class DeluxeHamburger extends Hamburger {

    private boolean chips;
    private boolean drinks;

    public DeluxeHamburger(String breadRollType, boolean meat, boolean chips, boolean drinks) {
        super(breadRollType, meat, 2.95);
        this.chips = chips;
        this.drinks = drinks;
    }

    public void addChips(){
        this.chips = true;
    }

    public void addDrinks(){
        this.drinks = true;
    }


    public void basePriceTotalIs(){
        System.out.println("Delux -> " );
    }

    public void whatDitIOrderd(){
        printOrder();
    }

    public boolean isChips() {
        return chips;
    }

    public boolean isDrinks() {
        return drinks;
    }

}