package opdrachtlinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();
        LinkedList<String> playList = new LinkedList<>();

        Album album1 = new Album("album perfact");
        album1.addSong("Edwin", "99");
        album1.addSong("Bart", "77");
        album1.addSong("Moeder", "987");
        albums.add(album1);

        Album album2 = new Album("Damn");
        album2.addSong("Remco", "32");
        album2.addSong("Hans", "44");
        albums.add(album2);

        // Aan playlist toevoegen
        playList.add(0, album1.getSongs().get(0).getTitel());
        playList.add(1, album1.getSongs().get(1).getTitel());
        playList.add(2, album2.getSongs().get(0).getTitel());

        playSongs(playList, albums);
    }


    private static void playSongs(LinkedList playList, ArrayList<Album> albums){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<String> listIterator = playList.listIterator();

        if (playList.isEmpty()){
            System.out.println("No song are selected");
            return;
        }

        int replaySong = 0;
        while (!quit){
            int action = scanner.nextInt();
            System.out.println("Maak keuze: ");
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Quit soundplayer");
                    quit=true;
                    break;
                case 1:
                    if (!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward=true;
                    }
                    if (listIterator.hasNext()){
                    System.out.println("Now play " + listIterator.next());
                    }else {
                        System.out.println("Reach the end of the playlist");
                        goingForward =false;
                    }
                    break;
                case 2:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward=false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now listing to " + listIterator.previous());
                        replaySong = listIterator.previousIndex();
                    }else {
                        System.out.println("We are at the start of the playlist");
                        goingForward =true;
                    }
                    break;
                case 3:
                    System.out.println(replaySong);

                    listIterator.next();
                    System.out.println("Replay song: " + listIterator.previous());



                    break;
                case 4:
                    listIterator.remove();
                    break;
                case 5:
                    printMenu();
                    break;

                case 6:
                    // add song
                    System.out.println("Welk song zoek je");
                    String songForSearch = scanner.nextLine();
                    boolean nietgevonden = false;
                    for (Album album : albums){
                        for (int i = 0; i < album.getSongs().size() ; i++) {
                            if (album.getSongs().get(i).getTitel().equals(songForSearch)){
                                listIterator.add(album.getSongs().get(i).getTitel());
                                System.out.println("Song toegevoegd");
                                nietgevonden = true;
                            }
                        }
                    }
                    if (!nietgevonden){
                        System.out.println("Song niet gevonden");
                    }
                    break;
            }
        }
    }

//    private static Song insertSong(String songName){
//        Album pak = null;
//        pak = pak.get()..searchForSong(songName);
//        return null;
//    }

    private static void printMenu(){
        System.out.println("Availbe actions: \n press ");
        System.out.println("0- to quit \n " +
        "1 - go to next song \n" +
        "2 - go to prevois song" +
        "5 - print menu options");
    }



}