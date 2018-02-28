package opdrachtinnerclass.zelfdoen;

import java.util.ArrayList;

public class Oefen {

    private String naam;
    private ArrayList<Connect> connects;

    public Oefen(String naam) {
        this.naam = naam;
        this.connects = new ArrayList<>();
    }


    public void addOefen(){
        this.connects.add(new Connect());
    }

    private class Connect{

    }
}
