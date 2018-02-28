package opdrachtObject.uitproberen;

/**
 * Created by CoxEGTPH on 8-2-2018.
 */
public class Main {

    public static void main(String[] args) {

        Car porsch = new Car();
        Car holden = new Car();

        System.out.println("Model is = + " + porsch.getModel());    // Output null, nog niet gezet.

        porsch.setModel("voetbal");

        System.out.println("Model is = + " + porsch.getModel());


    }
}
