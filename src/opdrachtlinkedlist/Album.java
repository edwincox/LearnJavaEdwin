package opdrachtlinkedlist;

import java.util.LinkedList;

/**
 * Created by CoxEGTPH on 7-2-2018.
 */
public class Album {

    private String albumName;
    private LinkedList<Songs> song;

    public Album(String albumName) {
        this.albumName = albumName;
        this.song = new LinkedList<Songs>();
    }


    public void addSong(String songName, String duration){
        song.add(new Songs(songName, duration));
    }

}
