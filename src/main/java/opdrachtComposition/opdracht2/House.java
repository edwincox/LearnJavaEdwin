package opdrachtComposition.opdracht2;

import java.util.ArrayList;

public class House {

    private int windows;
    private int etages;
    private double woonOpperVlakte;
    private ArrayList<Room> roomsList;

    public House(int windows, int etages, double woonOpperVlakte, ArrayList<Room> roomsList) {
        this.windows = windows;
        this.etages = etages;
        this.woonOpperVlakte = woonOpperVlakte;
        this.roomsList = roomsList;
    }

    public void addRoom(Room room){
    roomsList.add(room);
    }

  public int aantalStoelenInHetHuis(){
       int aantalStoelenInHetHuis = 0;

        for (Room room : roomsList){
            aantalStoelenInHetHuis += room.getAantalStoelen();
       }
        return aantalStoelenInHetHuis;
  }

    public int getWindows() {
        return windows;
    }

    public int getEtages() {
        return etages;
    }

    public double getWoonOpperVlakte() {
        return woonOpperVlakte;
    }


}
