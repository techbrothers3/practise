import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class amazon {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc"); list.add("bcd");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.hashCode() - t1.hashCode();
            }
        });

        System.out.println(list);
        System.out.println(list.get(0).hashCode());
        System.out.println(list.get(1).hashCode());

    }
}
