package zelfverzonnen;

import java.util.Random;

public class Klanten {

    private String klantNaam;
    private int klantBankrekening;
    private double KlantSaldo;
    private int pincodeKlant;

    public Klanten(String klantNaam, int klantBankrekening, int pincode) {
        this.klantNaam = klantNaam;
        this.klantBankrekening = klantBankrekening;
        KlantSaldo = 0.00;
        this.pincodeKlant = pincode;
    }

    public String getKlantNaam() {
        return klantNaam;
    }

    public int getKlantBankrekening() {
        return klantBankrekening;
    }

    public double getKlantSaldo() {
        return KlantSaldo;
    }





    public int getPincodeKlant() {
        return pincodeKlant;
    }




}
