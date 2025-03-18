package basicsofjava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListExample {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>();
        l.add(23);
        l.add(56);
        l.add(100);
        System.out.println(l);
        l.add(121);
        l.add(121);
        l.add(121);
        l.add(3,22);
        System.out.println(l);

        for(int k:l){
            System.out.println(k);
        }

        List<String> la = new ArrayList<String>();
        la.add("abc");
        la.add("xyz");

        for(String j:la){
            System.out.println(j);
        }

        System.out.println(l.get(2));

        Set <Integer> s = new HashSet<Integer>();
        s.add(12);
        s.add(24);
        s.add(12);
        s.add(45);
        s.add(12);
        System.out.println(s);
    }
}
