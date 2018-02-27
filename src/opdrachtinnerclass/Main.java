package opdrachtinnerclass;

public class Main {

    public static void main(String[] args) {

        GearBox mcLaren = new GearBox(6);

        mcLaren.addGear(1, 5.3);
        mcLaren.addGear(2, 10.6);
        mcLaren.addGear(3, 15.9);

        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);

        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelspeed(1000));

        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelspeed(3000));

        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelspeed(6000));

    }
}