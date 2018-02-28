package opdrachtObject.constructoropdracht;


public class Main {

    public static void main(String[] args){

        System.out.println("======================");

        VipCustomer firstCustomer = new VipCustomer();

        System.out.println("firstCustomer "
                + firstCustomer.getCreditLimit() + " "
                + firstCustomer.getEmailAdrs() +  " "
                + firstCustomer.getName());


        System.out.println("======================");

        VipCustomer secondCustomer = new VipCustomer(444.00, "second@hotmail.com");

        System.out.println("secondCustomer "
                + secondCustomer.getCreditLimit() + " "
                + secondCustomer.getEmailAdrs() +  " "
                + secondCustomer.getName());

        System.out.println("======================");

        VipCustomer thirdCustomer = new VipCustomer("Joepie", 444.00, "third@hotmail.com");

        System.out.println("thirdCustomer "
                + thirdCustomer.getCreditLimit() + " "
                + thirdCustomer.getEmailAdrs() +  " "
                + thirdCustomer.getName());

    }
}