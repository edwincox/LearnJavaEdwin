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

//        System.out.println("============ Healthyburger =============");
//        Healthyburger hamburger1 = new Healthyburger("brown rye bread roll",true, 3.95);
//        hamburger1.printOrder();
//        hamburger1.addBacon();
//        hamburger1.addCarrot();
//        hamburger1.printOrder();
//
//        System.out.println("==========Deluxe Hamburger========");
//        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("", true, 4.95 );
//        deluxeHamburger.printAllOrderd();
//        deluxeHamburger.printOrder();


    }

}
