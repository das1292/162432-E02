package Z1;

import java.time.LocalTime;

public class Zadanie1 {
    public static void main(String[] args){
        Integer[] Int1={1,2,3,99,3,2,1};
        ArrayUtil.jestPalindromem(Int1);
        Integer[] Int2={1,2,3,99,2,3,10};
        ArrayUtil.jestPalindromem(Int2);
        LocalTime[] LT1={
                LocalTime.of(10,11),
                LocalTime.of(12,13),
                LocalTime.of(9,45),
                LocalTime.of(12,45),
                LocalTime.of(10,13)
        };
        ArrayUtil.jestPalindromem(LT1);
        LocalTime[] LT2={
                LocalTime.of(10,11),
                LocalTime.of(13,11),
                LocalTime.of(9,45),
                LocalTime.of(13,11),
                LocalTime.of(10,11)
        };
        ArrayUtil.jestPalindromem(LT2);
    }
    public class ArrayUtil{
        static <T extends Comparable<T>>void jestPalindromem(T[] array){
            boolean palindrom=true;
            for(int i=0;i<array.length/2;i++){
                if(!array[i].equals(array[array.length-1-i])){
                    palindrom=false;

                }
                }
            if(palindrom==true)
            {
                System.out.println("Jest Palindromem");
            }
            else
            {
                System.out.println("Nie jest Palindromem");
            }
        }
    }
}
