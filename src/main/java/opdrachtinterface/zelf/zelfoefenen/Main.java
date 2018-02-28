package opdrachtinterface.zelf.zelfoefenen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Monster monster = new Monster("Edwin", "Sword");
        saveObject(monster);
        loadObject(monster);

        System.out.println(monster);

    }

    public static void saveObject(ISaveable iSaveable){
        iSaveable.write().size();
    }

    public static void loadObject(ISaveable iSaveable){
        List<String> geefMaarTerug = readValues();
        iSaveable.read(geefMaarTerug);
    }


    public static List<String> readValues() {
        List<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

}
