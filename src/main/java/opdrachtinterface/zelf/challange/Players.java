package opdrachtinterface.zelf.challange;

import java.util.ArrayList;
import java.util.List;

public class Players implements ISaveable {

    private String namePlayer;
    private String weaponPlayer;
    private int hipPoints;
    private int strength;


    public Players(String namePlayer, int hipPoints, int strength) {
        this.namePlayer = namePlayer;
        this.hipPoints = hipPoints;
        this.strength = strength;
        this.weaponPlayer = "Sword";
    }


//    @Override
    public List<String> winkey() {
        List<String> values = new ArrayList<>();
        values.add(0, this.namePlayer);
        values.add(1, "" + this.hipPoints);
        values.add(2, this.weaponPlayer);
        values.add(3, "" + this.strength);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size()>0){
            this.namePlayer = savedValues.get(0);
            this.hipPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weaponPlayer = savedValues.get(3);

        }
    }


    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public String getWeaponPlayer() {
        return weaponPlayer;
    }

    public void setWeaponPlayer(String weaponPlayer) {
        this.weaponPlayer = weaponPlayer;
    }

    public int getHipPoints() {
        return hipPoints;
    }

    public void setHipPoints(int hipPoints) {
        this.hipPoints = hipPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


    @Override
    public String toString() {
        return "Players{" +
                "namePlayer='" + namePlayer + '\'' +
                ", weaponPlayer='" + weaponPlayer + '\'' +
                ", hipPoints=" + hipPoints +
                ", strength=" + strength +
                '}';
    }
}
