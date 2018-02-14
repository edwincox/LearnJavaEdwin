package opdrachtpolymorphism.masterchallenge;

public class Main {

    public static void main(String[] args) {

//        Hamburger hamburger = new Hamburger("bread roll", true );
//
//        hamburger.finalPriceHamburger();
//        hamburger.addCarrot();
//        hamburger.addCarrot();
//        hamburger.addCarrot();
//        hamburger.addLecttuce();
//        hamburger.finalPriceHamburger();
//
//        System.out.println("=========================");
//        Healthyburger hamburger1 = new Healthyburger("brown rye bread roll",true);
//        hamburger1.finalPriceHamburger();
//        hamburger1.addBacon();
//        hamburger1.addCarrot();
//        hamburger1.finalPriceHamburger();

        System.out.println("=========================");
        DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
        deluxeHamburger.addChips();
        deluxeHamburger.addDrinks();
        deluxeHamburger.basePriceTotalIs();



    }

}
