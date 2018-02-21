package zelfverzonnen;

import java.util.ArrayList;

public class Vestigingen {

    private String vestigingsNaam;
    private String bankCode;
    private double eingenVermogen;

    private ArrayList<Klanten> klanten;

    public Vestigingen(String vestigingsNaam, String bankCode) {
        this.vestigingsNaam = vestigingsNaam;
        this.bankCode = bankCode;
        this.klanten = new ArrayList<Klanten>();   // Een vesteging heeft meerdere klanten
    }

    public void addKlantenToVestiging(String naamKlant, int klantBankrekeing, int pincode){
        klanten.add(new Klanten(naamKlant, klantBankrekeing, pincode));
    }


    public Klanten searchForBankAccountNumber(int bankAccountnumber){
        for (Klanten klant :klanten) {
            if (klant.getKlantBankrekening() == (bankAccountnumber)) {
                System.out.println("Klant met bankreking gevonden= " + bankAccountnumber);
                return klant;
            }
        }
        return null;
    }


    public String getVestigingsNaam() {
        return vestigingsNaam;
    }

    public String getBankCode() {
        return bankCode;
    }

    public double getEingenVermogen() {
        return eingenVermogen;
    }

    public ArrayList<Klanten> getKlanten() {
        return klanten;
    }




}
