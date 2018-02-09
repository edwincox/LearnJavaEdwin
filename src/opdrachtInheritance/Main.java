package opdrachtInheritance;

/**
 * Created by CoxEGTPH on 9-2-2018.
 */
public class Main {

    public static void main(String[] args) {

        Ford ford = new Ford(true, 5, 0, 2, true, true);
        ford.changingGears(1);
        ford.changingGears(2);
        ford.changingGears(1);

    }
}
