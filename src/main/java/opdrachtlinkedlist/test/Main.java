package opdrachtlinkedlist.test;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by CoxEGTPH on 8-2-2018.
 */
public class Main {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("test");
        linkedList.add("test1234");
        linkedList.add("test9999");

        ListIterator<String> listIterator = linkedList.listIterator();

        System.out.println("Now Playing " + listIterator.next());


    }
}
