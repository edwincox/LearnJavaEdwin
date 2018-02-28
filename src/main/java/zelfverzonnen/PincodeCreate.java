package zelfverzonnen;

import java.util.ArrayList;
import java.util.Random;

public class PincodeCreate {

    private ArrayList<Vestigingen> vestigingen;

    public PincodeCreate(ArrayList<Vestigingen> vestigingen) {
        this.vestigingen = vestigingen;
    }

    public int randomPincodeMaker(){
        Random random = new Random();
        String aanelkaar = "";


        for (int i = 0; i < 4 ; i++) {
            int plak = random.nextInt(9);

            aanelkaar = "" + aanelkaar + plak;

        }
        return Integer.parseInt(aanelkaar);
    }

    private boolean checkIfPincodeAlreadyExist(ArrayList<Vestigingen> vestigingens, int pin){
        for (Vestigingen vestigingen : vestigingens) {
            for (Klanten klant : vestigingen.getKlanten()){
                if (klant.getPincodeKlant() == (pin)) {
                    System.out.println("Dit pincode bestaat al opnieuw pincode genereren");
                    return false;
                }
            }
        }
        return true;
    }


    public int createRandomPincode(ArrayList<Vestigingen> vestigingens){
        int randomPincode = randomPincodeMaker();

        boolean blijfgaan = true;

        while (blijfgaan) {

            if (checkIfPincodeAlreadyExist(vestigingens, randomPincode)) {
                blijfgaan = false;
            }
        }

        return randomPincode;
    }

}
