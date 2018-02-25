package opdrachtinnerclass.zelfdoen;

import java.util.ArrayList;

public class GearBox {

    private int totalGear;
    private ArrayList<Gear> gear;
    private int currentGear = 0;


    public GearBox(int totalGear) {
        this.totalGear = totalGear;
        this.gear = new ArrayList<>();
    }

    public void addGear(int gear, double ratio){
        this.gear.add(new Gear(ratio, gear));
    }



    private class Gear{
    // inner class

    private double ratio;
    private int gear;

        public Gear(double ratio, int gear) {
            this.ratio = ratio;
            this.gear = gear;
        }
    }



}
