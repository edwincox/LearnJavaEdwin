package opdrachtpolymorphism.masterchallenge;

public class Hamburger {

    private String breadRollType;
    private boolean meat;

    private boolean lecttuce;
    private boolean tomato;
    private boolean carrot;
    private boolean sla;
    private double totalPriceToPay = 2.95;

    public Hamburger(String breadRollType, boolean meat) {
        if(breadRollType.trim() == "bread roll" | breadRollType.trim() == "brown rye bread roll" | breadRollType.trim() == "Deluxe Hamburger") {
            this.breadRollType = breadRollType;
        }else {
            this.breadRollType = "Unknow hamburger";
        }

        if (this.meat = true){
            this.totalPriceToPay = totalPriceToPay + 1.00;
        }
        this.totalPriceToPay = totalPriceToPay;
    }



    public void finalPriceHamburger(){
        System.out.println("Dear customer you have to pay " + getTotalPriceToPay());
    }


    public void addLecttuce(){
        this.lecttuce = true;
        this.totalPriceToPay += 0.50;
    }

    public void addTomato(){
        this.tomato = true;
        this.totalPriceToPay += 0.50;
    }

    public void addCarrot(){
        this.carrot = true;
        this.totalPriceToPay += 0.50;
    }

    public void addSla(){
        this.sla = true;
        this.totalPriceToPay += 0.50;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public boolean isMeat() {
        return meat;
    }

    public boolean isLecttuce() {
        return lecttuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public boolean isSla() {
        return sla;
    }

    public void addByTotalPrice(double addToPrice){
        this.totalPriceToPay = this.totalPriceToPay + addToPrice;
    }

    public double getTotalPriceToPay() {
        return totalPriceToPay;
    }
}
