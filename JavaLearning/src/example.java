import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class example {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Pankaj");
        names.add("Puru");
        Iterator<String> itr = names.iterator();
        while(itr.hasNext())
            System.out.println((itr.next()).toString());


    }
}
