package opdrachtautoboxing;

public class Main {

    public static void main(String[] args){

        Bank rabobank = new Bank("Rabobank");

        rabobank.addBranch("Venray Rabobank");

        rabobank.addCustomer("Venray Rabobank" , "Edwin Cox", 51.59);
        rabobank.addCustomer("Venray Rabobank" , "Leo Cox", 98.56);
        rabobank.addCustomer("Venray Rabobank" , "Nicolette Cox", 33.59);

        rabobank.addBranch("Utrecht Rabobank");
        rabobank.addCustomer("Utrecht Rabobank" , "Bart Cox", 60.66);

        rabobank.addCustomerTransacton("Venray Rabobank", "Edwin Cox", 10.09);
        rabobank.addCustomerTransacton("Venray Rabobank", "Edwin Cox", 10.09);
        rabobank.addCustomerTransacton("Venray Rabobank", "Leo Cox", 10.09);

        rabobank.addCustomerTransacton("Utrecht Rabobank", "Bart Cox", 10.09);
        rabobank.addCustomerTransacton("Utrecht Rabobank", "Bart Cox", 10.09);
        rabobank.addCustomerTransacton("Utrecht Rabobank", "Bart Cox", 10.09);

        rabobank.listCustomer("Venray Rabobank",true);

        System.out.println("---------------------");

        rabobank.listCustomer("Utrecht Rabobank",true);

    }
}
