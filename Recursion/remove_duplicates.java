import java.util.Scanner;

public class remove_duplicates {
    public static void remove(String str){
        String newStr = "";
        char currentChar;
        for (int idx = 0; idx < str.length(); idx++) {
            currentChar = str.charAt(idx);

            if(newStr.indexOf(currentChar) == -1){
                newStr += currentChar;
            }

        }
        System.out.println("string withour duplicates is: "+ newStr);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       String str = sc.next();
       remove(str); 
    }
}
