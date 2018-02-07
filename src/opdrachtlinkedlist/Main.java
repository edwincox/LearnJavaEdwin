package opdrachtlinkedlist;

import sun.org.mozilla.javascript.internal.ast.ScriptNode;

import java.util.Scanner;

/**
 * Created by CoxEGTPH on 7-2-2018.
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Album album1 = new Album("album perfact");

        album1.addSong("Wonderful morning", "3:59");
        album1.addSong("Wonderful morning", "4:78");
        album1.addSong("Wonderful morning", "5:47");
        album1.addSong("Wonderful morning", "6:36");
        album1.addSong("Wonderful morning", "7:25");
        album1.addSong("Wonderful morning", "8:14");

    }


    public static void playList() {
        boolean quit = false;
        startPhone();
        printActions();

        while (!quit) {

            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }
}