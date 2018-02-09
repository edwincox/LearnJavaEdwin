package opdrachtlinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by CoxEGTPH on 7-2-2018.
 */
public class Main {



    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();
        ArrayList<Song> playList = new ArrayList<>();

        Album album1 = new Album("album perfact");
        album1.addSong("Edwin", "99");
        album1.addSong("Bart", "77");
        albums.add(album1);

        Album album2 = new Album("Damn");
        album2.addSong("Remco", "32");
        album2.addSong("Hans", "44");
        albums.add(album2);

        playList.add(albums.get(0).getSongs().get(0));

        album1.playlist();
    }






    public static void playList(LinkedList album) {

        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        boolean goingForward = true;

        //LinkedList<Song> song1 = album.get;

        //ListIterator<String> listIterator = song1.listIterator();

        addNewContact();


        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

//            switch (action) {
//                case 0:
//                    System.out.println("\nShutting down...");
//                    quit = true;
//                    break;
//                case 1:
//                    if (listIterator.hasNext()){
//                        System.out.println("Now Playing " );
//                        listIterator.next();
//                    }else {
//                        System.out.println("Reached the end of the playlist");
//                    }
//                    break;
//                case 2:
//                    addNewContact();
//                    break;
//                case 3:
//                    if (!goingForward){
//                        if (listIterator.hasNext()){
//                            listIterator.next();
//                        }
//                        goingForward=true;
//                    }
//                    if (listIterator.hasNext()){
//                        System.out.println("Now playing song " + listIterator.next());
//                    }else {
//                        System.out.println("Reached the end of the playlist");
//                    }
//                    break;
//                case 4:
//                    //skipBackwardsToAPreviousSong();
//                case 5:
//                    //removeSong();
//                    break;
//                case 6:
//                    querySongs();
//                    break;
//                case 7:
//                    printActions();
//                    break;
//            }
        }
    }







    private static void addNewContact() {
//        System.out.println("Enter song name: ");
//        String nameSong = scanner.nextLine();
//        System.out.println("Enter song duration: ");
//        String duration = scanner.nextLine();
//        album.addSong(nameSong, duration);
    }


}