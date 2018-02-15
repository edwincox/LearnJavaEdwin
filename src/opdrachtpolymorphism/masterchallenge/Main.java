package opdrachtpolymorphism.masterchallenge;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("bread roll", true, 2.95 );

        hamburger.printOrder();
        hamburger.addCarrot();
        hamburger.addCarrot();
        hamburger.addCarrot();
        hamburger.addLecttuce();
        hamburger.printOrder();

        System.out.println("============ Healthyburger =============");
        Healthyburger hamburger1 = new Healthyburger("brown rye bread roll",true, 3.95);
        hamburger1.printOrder();
        hamburger1.addBacon();
        hamburger1.addCarrot();
        hamburger1.printOrder();

//        System.out.println("=========================");
//        DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
//        deluxeHamburger.addChips();
//        deluxeHamburger.addDrinks();
//        deluxeHamburger.basePriceTotalIs();
//        deluxeHamburger.whatDitIOrderd();



    }

}
