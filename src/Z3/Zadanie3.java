package Z3;

import java.io.File;
import java.util.List;

public class Zadanie3 {
    public static void main(String[] args){
        List.of(metoda("src/"));
    }
    public static String[] metoda(String t){
        String[] c={};
        File folder=new File(t);
        c=folder.list((f,g)->f.isDirectory());
        if(c!=null)
        {
            for(String file:c)
            {
                 System.out.println(file);
            }
        }
        return c;
    }
}

