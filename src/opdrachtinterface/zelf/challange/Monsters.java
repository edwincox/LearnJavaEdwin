package opdrachtinterface.zelf.challange;

import java.util.List;

public class Monsters implements ISaveable {

    private String monterName;
    private int hitpoints;
    private String weaponMonter;
    private int strenghtMonser;

    @Override
    public List<String> winkey() {



return null;
    }

    @Override
    public void read(List<String> savedValues) {
    if(savedValues.size() > 0 && savedValues != null){
        this.monterName = savedValues.get(0);
        this.hitpoints = Integer.parseInt(savedValues.get(1));
        this.weaponMonter = savedValues.get(2);
        this.strenghtMonser = Integer.parseInt(savedValues.get(3));
    }

    }
}
