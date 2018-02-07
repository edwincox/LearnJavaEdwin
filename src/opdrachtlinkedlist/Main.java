package opdrachtlinkedlist;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by CoxEGTPH on 7-2-2018.
 */
public class Main {

    private Album album;

    public static void main(String[] args) {
        Album album1 = new Album("album perfact");
        album1.addSong("Edwin", "99");
        album1.addSong("Bart", "77");

        LinkedList<String> song = album1.getSong();
        playList(song);
    }






    public static void playList(LinkedList album) {

        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        boolean goingForward = true;

        ListIterator<String> listIterator = album.listIterator();

        addNewContact();
        startPhone();
        printActions();

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    if (listIterator.hasNext()){
                        System.out.println("Now Playing " + listIterator.next());
                    }else {
                        System.out.println("Reached the end of the playlist");
                    }
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    if (!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward=true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now playing song " + listIterator.next());
                    }else {
                        System.out.println("Reached the end of the playlist");
                    }
                    break;
                case 4:
                    //skipBackwardsToAPreviousSong();
                case 5:
                    //removeSong();
                    break;
                case 6:
                    querySongs();
                    break;
                case 7:
                    printActions();
                    break;
            }
        }
    }

    private static void skipForwardToTheNextsong() {

    }

    private static void querySongs() {
       // album1.letListAllTheSong();
    }

    private static void printActions() {
        System.out.println("---action menu----------" +
                "");
    }

    private static void addNewContact() {
//        System.out.println("Enter song name: ");
//        String nameSong = scanner.nextLine();
//        System.out.println("Enter song duration: ");
//        String duration = scanner.nextLine();
//        album.addSong(nameSong, duration);
    }

    private static void startPhone() {
        System.out.println("Play list started ");
    }
}