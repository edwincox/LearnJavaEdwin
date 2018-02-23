package opdrachtinnerclass.opdrachtOnline;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by dev on 18/09/15.
 */
public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.addSong(new Song(title, duration));
    }



    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }





    private class SongList {
        private ArrayList<Song> liedjes;

        public SongList() {
            this.liedjes = new ArrayList<>();
        }

        public boolean addSong(Song song){
            if (liedjes.contains(song)){
                return false;
            }
            this.liedjes.add(song);
            return true;
        }

        private Song findSong(String title) {
            for(Song checkedSong: this.liedjes) {
                if(checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        public Song findSong(int trackNumber){
            int index = trackNumber -1;
            if ((index > 0 ) && (index < liedjes.size())){
                return liedjes.get(index);
            }
            return null;
        }


    }

}
