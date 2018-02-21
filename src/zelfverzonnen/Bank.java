package zelfverzonnen;

import java.util.ArrayList;

public class Bank {

    private String namebank;
    private ArrayList<Vestigingen> vestigingen;

    public Bank(String namebank) {
        this.namebank = namebank;
        this.vestigingen = new ArrayList<Vestigingen>();
    }


    public void addAVestigingsBank(String name, String bankcode){
        vestigingen.add(new Vestigingen(name, bankcode));
    }

    public void addKlanten(String vestingNaam,String naamKlant, int klantBankrekeing ){
        int indexOf;
        for (Vestigingen vestiging : vestigingen){
            if (vestingNaam.equals(vestiging.getVestigingsNaam())){
                System.out.println("Vestigingsnaam gevonden");
                indexOf= vestigingen.indexOf(vestiging);
                System.out.println("index = " + indexOf);
                PincodeCreate pincodeCreate = new PincodeCreate(vestigingen);
                vestiging.addKlantenToVestiging(naamKlant, klantBankrekeing, pincodeCreate.createRandomPincode(this.vestigingen));
            }
        }
    }


    public void whatIsMyBankAccountSaldo(int bankAccountNumber){
        for (Vestigingen vestiging : vestigingen){
            Klanten klanten = vestiging.searchForBankAccountNumber(bankAccountNumber);
            if (klanten != null) {
                System.out.println("Uw banksaldo is " + klanten.getKlantSaldo() + " voor klant: " + klanten.getKlantNaam());
                break;
            }
        }
    }


    public String getNamebank() {
        return namebank;
    }

    public ArrayList<Vestigingen> getVestigingen() {
        return vestigingen;
    }


    public ArrayList<Klanten> printListAllCustomers() {
        ArrayList<Klanten> klanten = new ArrayList<>();
        for (Vestigingen vestiging : vestigingen){
            for (Klanten klant :  vestiging.getKlanten()){
                klanten.add(klant);
            }
        }
        return klanten;
    }
}
