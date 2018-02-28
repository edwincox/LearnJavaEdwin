package opdrachtComposition.opdracht1;

public class Room {

    private int aantalStoelen;
    private int aantalTafels;
    private int aantalKasten;
    private boolean tapijt;

    public Room(int aantalStoelen, int aantalTafels, int aantalKasten, boolean tapijt) {
        this.aantalStoelen = aantalStoelen;
        this.aantalTafels = aantalTafels;
        this.aantalKasten = aantalKasten;
        this.tapijt = tapijt;
    }

    public void aantalStoelenInHetHuis(){
        System.out.println("Aantal stoelen in het huis " + getAantalStoelen());
    }

    public int getAantalStoelen() {
        return aantalStoelen;
    }

    public int getAantalTafels() {
        return aantalTafels;
    }

    public int getAantalKasten() {
        return aantalKasten;
    }

    public boolean isTapijt() {
        return tapijt;
    }
}
