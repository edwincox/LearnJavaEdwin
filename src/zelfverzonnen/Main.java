package zelfverzonnen;

public class Main {

    public static void main(String[] args) {

    Bank rabobank = new Bank("Rabobank");

    rabobank.addAVestigingsBank("Rabobank Venray", "1110");
        rabobank.addAVestigingsBank("Rabobank Eindhoven", "2222");


        rabobank.addKlanten("Rabobank Venray", "Edwin Cox", 123);
        rabobank.addKlanten("Rabobank Venray", "Nicolette Cox", 899);

        rabobank.addKlanten("Rabobank Eindhoven", "Pietter Hanson", 232);


        System.out.println("=========Edwin account==========");
        rabobank.whatIsMyBankAccountSaldo(123);


    }
}
