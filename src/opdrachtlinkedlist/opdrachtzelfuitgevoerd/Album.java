package opdrachtlinkedlist.opdrachtzelfuitgevoerd;

import java.util.LinkedList;

/**
 * Created by CoxEGTPH on 7-2-2018.
 */
public class Album {

    private String albumName;
    private LinkedList<Song> songs;


    public Album(String albumName) {
        this.albumName = albumName;
        this.songs = new LinkedList<Song>();
    }


    public void addSong(String songName, String duration){
        songs.add(new Song(songName, duration));
    }

    public String getAlbumName() {
        return albumName;
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }

//    public Song searchForSong(ArrayList<Album> albums, String songName){
//        for (Album album : albums){
//            for (int i = 0; i < album.getSongs().size() ; i++) {
//                if (album.getSongs().get(i) == songName){
//
//                }
//            }
//        }
//
//        for (Song song : getSongs()){
//            if (zoekSongNummer == song.getTitel()){
//                return song;
//            }
//        }
//        return null;
//    }
}
