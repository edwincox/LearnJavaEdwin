package opdrachtlinkedlist.opdrachtzelfuitgevoerd;

/**
 * Created by CoxEGTPH on 7-2-2018.
 */
public class Song {

    private String titel;
    private String duration;

    public Song(String titel, String duration) {
        this.titel = titel;
        this.duration = duration;
    }

    public String getTitel() {
        return titel;
    }

    public String getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "titel='" + titel + '\'' + " duration=" + this.duration +
                '}';
    }
}
