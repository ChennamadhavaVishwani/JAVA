public class count_unique_substrings {
    static class Node{
        Node[] children;
        Boolean eow;

        public Node(){
            children = new Node[26];
            for(int i = 0; i<26; i++){
                children[i] = null; 
            }
            eow = false;

        }
    }
    static Node root = new Node();
    static int count = 0; 

    public static void insertSuffixes(String word) {
        for (int i = 0; i < word.length(); i++) {
            insert(word.substring(i));
        }
    }
   
    
    public static void insert(String word) {
    Node curr = root;  

    for (int i = 0; i < word.length(); i++) {
        int idx = word.charAt(i) - 'a';

        if (curr.children[idx] == null) {
            curr.children[idx] = new Node();
        }

        curr = curr.children[idx]; 
    }

    curr.eow = true; 
}

    public static boolean search(String key) {
    Node curr = root;  

    for (int i = 0; i < key.length(); i++) {
        int idx = key.charAt(i) - 'a';

        if (curr.children[idx] == null) {
            return false;
        }

        curr = curr.children[idx]; 
    }

    return curr.eow == true;  
}

    public static boolean startsWith(String key){
        Node curr = root;  

    for (int i = 0; i < key.length(); i++) {
        int idx = key.charAt(i) - 'a';

        if (curr.children[idx] == null) {
            return false;
        }
        curr = curr.children[idx];
    }
    return true;
    }
    
    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i = 0; i<26; i++){
            if(root.children[i]!= null){
                count += countNodes(root.children[i]);
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        String str = "ababa";
        insertSuffixes(str);

        for(int i = 0; i<str.length(); i++){
            String suffix = str.substring(i);
            System.out.println(suffix);
        }
        System.out.println(countNodes(root));
    }
}
