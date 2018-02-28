package opdrachtinterface.zelf.challange;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

    Players players = new Players("edwin", 100, 80);
        System.out.println(players.toString());
        saveObject(players);
        loadObject(players);

        System.out.println(players);
    }


    public static void saveObject(ISaveable saveObject){
        for (int i = 0; i < saveObject.winkey().size() ; i++) {
            System.out.println("Savind" + saveObject.winkey().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        List<String> values = readValues();
        objectToLoad.read(values);
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
