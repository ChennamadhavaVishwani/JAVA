//The below code is a working code of java to find the first and last occurence of a character in a string

import java.util.*;

public class Recursion {
    public static int front = -1;
    public static int last = -1;

    public static void func(String str, int idx, char element){
       if (idx >= str.length()) {
        return;
    }
        char currChar = str.charAt(idx);
        if(currChar == element){
            if(front == -1){
                front = idx;
            }else{
                 last = idx;
        }
       }
       func(str, idx+1, element);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char element = sc.next().charAt(0);

        func(str,0,element );

        System.out.println("First occurrence: " + (front+1));
        System.out.println("Last occurrence: " + (last != -1 ? last+1 : front+1));
    }
}
