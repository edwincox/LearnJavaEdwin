package opdrachtinterface.zelf.zelfoefenen;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{

    private String naamMonster;
    private String weaponMonster;

    public Monster(String naamMonster, String weaponMonster) {
        this.naamMonster = naamMonster;
        this.weaponMonster = weaponMonster;
    }

    @Override
    public List<String> write() {
        ArrayList<String> mylist = new ArrayList<>();
        mylist.add(0, this.naamMonster);
        mylist.add(1, this.weaponMonster);

        return mylist;
    }

    @Override
    public void read(List<String> interfaceList) {
        this.naamMonster = interfaceList.get(0);
        this.weaponMonster = interfaceList.get(1);
    }

    @Override
    public String toString() {
        return "Monster{" +
                "naamMonster='" + naamMonster + '\'' +
                ", weaponMonster='" + weaponMonster + '\'' +
                '}';
    }
}
