package opdrachtlinkedlist;

/**
 * Created by CoxEGTPH on 7-2-2018.
 */
public class Songs {

    private String titel;
    private String duration;

    public Songs(String titel, String duration) {
        this.titel = titel;
        this.duration = duration;
    }

    public String getTitel() {
        return titel;
    }

    public String getDuration() {
        return duration;
    }
}
