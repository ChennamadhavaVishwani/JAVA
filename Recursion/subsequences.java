public class subsequences {
    public static void func(String str, int idx, String newstr){
        if(idx == str.length()){
            System.err.println(newstr);
            return;
        }
        char currentChar = str.charAt(idx);
        
        func(str, idx+1, newstr);

        func(str, idx+1, newstr+currentChar);
    }

    public static void main(String[] args) {
        String str = "abc";
        func(str, 0, "");
    }
}
