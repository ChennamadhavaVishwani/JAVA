
import java.util.*;

public class reverse {

    public static String printrev(String str, int idx) {
        if (idx == 0) {
            // System.out.print(str.charAt(idx));
            return "" + str.charAt(idx);
        }
        return str.charAt(idx) + printrev(str, idx - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String vishu = printrev(str, str.length() - 1);
        System.out.print(vishu);
    }
}
