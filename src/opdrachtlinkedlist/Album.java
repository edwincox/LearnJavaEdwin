package opdrachtlinkedlist;

import java.util.LinkedList;

/**
 * Created by CoxEGTPH on 7-2-2018.
 */
public class Album {

    private String albumName;
    private LinkedList<String> song;

    public Album(String albumName) {
        this.albumName = albumName;
        this.song = new LinkedList<String>();
    }

    public LinkedList<String> getSong() {
        return song;
    }

    public void addSong(String songName, String duration){
        //song.add(new Songs(songName, duration));
    }

//    public void letListAllTheSong(){
//        int i =0;
//        System.out.println("----List playsong-------");
//        for (Songs song : song){
//            i++;
//            System.out.println(i + ") Songname: " + song.getTitel() + " Duration: " + song.getDuration());
//        }
//        if (i < 1){
//            System.out.println("empty song list");
//        }
//    }
}
