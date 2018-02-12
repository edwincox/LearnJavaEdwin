package opdrachtComposition.opdracht2;

public class Main {
    public static void main(String[] args) {


        Room room1 = new Room(4, 6, 2, false);
        Room room2 = new Room(8, 6, 2, false);
        Room room3 = new Room(18, 6, 2, false);

        House house = new House(8, 2, 140.00);

        house.addRoom(room1);
        house.addRoom(room2);
        house.addRoom(room3);


        System.out.println("Aantal stoelen " + house.aantalStoelenInHetHuis());

    }
}
