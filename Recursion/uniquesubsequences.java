import java.util.HashSet;

public class uniquesubsequences {
    public static void func(String str, int idx, String newstr, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newstr)){
                return;
            } else {
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }

        char currentChar = str.charAt(idx);

        // Exclude current character
        func(str, idx + 1, newstr, set);

        // Include current character
        func(str, idx + 1, newstr + currentChar, set);
    }

    public static void main(String[] args) {
        String str = "aac";
        HashSet<String> set = new HashSet<>();
        func(str, 0, "", set);
    }
}
