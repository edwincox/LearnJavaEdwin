package opdrachtComposition.opdracht2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // todo een lijst van rooms meegeven aan house
        Room room1 = new Room(14, 6, 2, false);
        Room room2 = new Room(8, 6, 2, false);
        Room room3 = new Room(18, 6, 2, false);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);


        House house = new House(8, 2, 140.00, rooms);




        System.out.println("Aantal stoelen " + house.aantalStoelenInHetHuis());

    }
}
