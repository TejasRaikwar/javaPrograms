package practiceProblems;
import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(4);
        l1.add(5);
        l1.add(7);

        l1.add(0,1);
        l1.add(0,2);
//        System.out.println(l1);
        for(int i = 0  ; i<l1.size() ; i++)
            System.out.println(l1.get(i));
    }
}
