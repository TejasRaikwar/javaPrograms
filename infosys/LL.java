package infosys;

import java.util.ArrayList;
import java.util.List;

public class LL {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(0,1);
        l1.add(1,2);
        System.out.println(l1);

        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(0,3);
        l2.add(1,4);
        l2.addAll(0,l1);
        l2.set(1,99);
        System.out.println(l2.get(1));

    }
}
