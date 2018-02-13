package opdrachtpolymorphism.masterchallenge;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Normal Hamburger", false);

        hamburger.finalPriceHamburger();
        hamburger.addCarrot();
        hamburger.addLecttuce();
        hamburger.finalPriceHamburger();

    }

}
