package opdrachtObject.constructoropdracht;

/**
 * Created by CoxEGTPH on 9-2-2018.
 */
public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAdrs;

    public VipCustomer() {
        this("default vipCustomer", 2.22, "default emailadrs");
        System.out.println("1 Constructor call");
    }

    public VipCustomer(double creditLimit, String emailAdrs) {
        this("2nd default vipCustomer", creditLimit, emailAdrs);
        System.out.println("2 Constructor call");

    }

    public VipCustomer(String name, double creditLimit, String emailAdrs) {
        System.out.println("3 Constructor call");
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdrs = emailAdrs;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdrs() {
        return emailAdrs;
    }
}