package Z2;

import java.util.ArrayList;
import java.util.List;

public class Zadanie2 {
    public static void main(String[] args){
        List<String> l1=new ArrayList<String>();
        l1.add("A");
        l1.add("B");
        l1.add("C");
        l1.add("D");
        l1.add("E");
        Zadanie2.Codrugi(l1);
        List<Integer> l2=new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        Zadanie2.Codrugi(l2);
    }
    public static <T extends Iterable<E>, E>void Codrugi(T iterable){
        boolean codrugi=true;
        for(E t:iterable){
            if(codrugi){
                System.out.println(t+",");
            }
            codrugi=!codrugi;
        }
    }
}
