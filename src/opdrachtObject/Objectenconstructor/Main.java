package opdrachtObject.Objectenconstructor;

/**
 * Created by CoxEGTPH on 9-2-2018.
 */
public class Main {

    public static void main(String[] args){
        BankAccount edwin = new BankAccount();


        //BankAccount nicolette = new BankAccount();


        edwin.depositFunds(50.00);
        edwin.whatIsMyBalance();

        edwin.depositFunds(51.00);
        edwin.whatIsMyBalance();

        edwin.withdrawFunds(100.00);
        edwin.whatIsMyBalance();


        System.out.println("=========================");
//        nicolette.depositFunds(225.00);
//        nicolette.withdrawFunds(180.00);
//        nicolette.whatIsMyBalance();

        System.out.println("=========================");

        BankAccount timsaccount = new BankAccount("Hans", "niks@hotmail.com" ,"48484");
        System.out.println(timsaccount.getAccountNumber() + timsaccount.getBalance());
    }


}