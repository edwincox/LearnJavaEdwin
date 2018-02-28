package opdrachtpolymorphism.masterchallenge;

public class Hamburger {

    private static final double SLA_PRICE = 0.20;
    private static final double LECTTUCE_PRICE = 0.50;
    private static final double CARROT_PRICE = 0.30;
    private static final double TOMATO_PRICE = 0.40;
    private String breadRollType;
    private boolean meat;

    private int numberOfLecttuce;

    private int numberOfTomato;
    private int numberOfCarrot;

    private int numberOfSla;

    private double price;
    private double totalPrice = 0;

    public Hamburger(String breadRollType, boolean meat, double price) {
        if(breadRollType.trim() == "bread roll" | breadRollType.trim() == "brown rye bread roll" | breadRollType.trim() == "Deluxe Hamburger") {
            this.breadRollType = breadRollType;
        }else {
            this.breadRollType = "Unknow hamburger";
        }
        this.meat = meat;
        this.price = price;
    }

    public double calculateTotalPrice(){
        totalPrice = (meat ? 1.21 : 0.00 )+ price + (numberOfSla * SLA_PRICE) + (numberOfLecttuce * LECTTUCE_PRICE) + (numberOfCarrot * CARROT_PRICE) + (numberOfTomato * TOMATO_PRICE);
        return totalPrice;
    }

    public void addLecttuce(){
        this.numberOfLecttuce += 1;
    }

    public void addTomato(){
        this.numberOfTomato += 1;
    }

    public void addCarrot(){
        this.numberOfCarrot += 1;
    }

    public void addSla(){
        this.numberOfSla += 1;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void printOrder(){
        System.out.println("=====Menu Order=======");
        printAllOrderd();
        System.out.println("Total price = " + calculateTotalPrice());
        System.out.println("======================");

    }

    public void printAllOrderd() {
        System.out.println("Total sla: " +  + getNumberOfSla());
        System.out.println("Total carrot: " + getNumberOfCarrot());
        System.out.println("Total lecttuce: " + getNumberOfLecttuce());
        System.out.println("Total tomato: " + getNumberOfTomato());
    }

    public boolean isMeat() {
        return meat;
    }

    public int getNumberOfLecttuce() {
        return numberOfLecttuce;
    }

    public int getNumberOfTomato() {
        return numberOfTomato;
    }

    public int getNumberOfCarrot() {
        return numberOfCarrot;
    }

    public int getNumberOfSla() {
        return numberOfSla;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public static double getSlaPrice() {
        return SLA_PRICE;
    }

    public static double getLecttucePrice() {
        return LECTTUCE_PRICE;
    }

    public static double getCarrotPrice() {
        return CARROT_PRICE;
    }

    public static double getTomatoPrice() {
        return TOMATO_PRICE;
    }
}
