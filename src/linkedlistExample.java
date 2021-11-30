import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistExample {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<String>();
        ls.add("r");
        ls.add("q");
        ls.add("w");
        ls.add("s");

        Iterator<String> itr = ls.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
