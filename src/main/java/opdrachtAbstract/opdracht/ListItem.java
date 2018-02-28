package opdrachtAbstract.opdracht;

import java.util.List;

public abstract class ListItem {

    private ListItem previous;
    private ListItem next;

    private Object value;

    public abstract int compareTo(ListItem listItem);

    public void setPrevious(ListItem previous) {
        this.previous = previous;
    }

    public void setNext(ListItem next) {
        this.next = next;
    }

    public ListItem getPrevious() {
        return previous;
    }

    public ListItem getNext() {
        return next;
    }
}
