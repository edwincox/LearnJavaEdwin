package opdrachtlinkedlist;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by CoxEGTPH on 7-2-2018.
 */
public class Album {

    private String albumName;
    private LinkedList<Song> songs;

    public static Scanner scanner = new Scanner(System.in);



    public Album(String albumName) {
        this.albumName = albumName;
        this.songs = new LinkedList<Song>();
    }



    public LinkedList<Song> getSongs() {
        return songs;
    }

    public void addSong(String songName, String duration){
        songs.add(new Song(songName, duration));
    }

//    public void letListAllTheSong(){
//        int i =0;
//        System.out.println("----List playsong-------");
//        for (Song songs : songs){
//            i++;
//            System.out.println(i + ") Songname: " + songs.getTitel() + " Duration: " + songs.getDuration());
//        }
//        if (i < 1){
//            System.out.println("empty songs list");
//        }
//    }


    public void playlist() {

        ListIterator<Song> listIterator = songs.listIterator();

        boolean quit = false;
        boolean goingForward = true;


        startPhone();

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();


            // // TODO: 8-2-2018  quit skipforward to the netxt songs  ,
            // skip backwards to a previous songs   ,
            // replay the current songs
            // list the playsong

            switch (action) {
            case 0:
                System.out.println("\nShutting down...");
                quit = true;
                break;
            case 1:
                if ((!goingForward)){
                    if (listIterator.hasNext()){
                        listIterator.next();
                    }
                    goingForward = true;
                }
                if (listIterator.hasNext()) {
                    System.out.println("Now Playing " + listIterator.next().getTitel());
                } else {
                    System.out.println("Reached the end of the playlist");
                }

                break;
                case 2:
                    if ((goingForward)){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().getTitel());
                    }else {
                        System.out.println("We are at the start of the playlist");
                    }
                    break;
                case 4:

                case 5:
                    listPlaysongList((listIterator));
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

    private void replyCurentSong() {

    }

    private void listPlaysongList(ListIterator<Song> listIterator) {
        int i = 0;
        boolean gadoor = true;
        System.out.println("==========List playsong===========");
        while (listIterator.hasPrevious()){
            System.out.println("Number " + i + " Song: " + listIterator.next().getTitel() + " Duration: " + listIterator.next().getDuration());
            if (!listIterator.hasNext() ){
                gadoor = false;
            }
        }
//        for (ListIterator<Song> list : listIterator){
//            i++;
//            System.out.println("Number " + i + " Song: " + list.getTitel() + " Duration: " + list.getDuration());
//        }
    }


    private static void skipForwardToTheNextsong() {

    }

    private static void startPhone() {
        System.out.println("Play list started ");
    }

    private static void printActions() {
        System.out.println("---action menu----------" +
                "");
    }

    private static void querySongs() {
        System.out.println("Enter songs name: ");
        String nameSong = scanner.nextLine();


        // album1.letListAllTheSong();
    }




}
