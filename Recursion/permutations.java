
import java.util.Scanner;

public class permutations {

    public static void func(String str, String perm) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            func(newstr, perm + currentChar);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        func(str, "");
    }
}
