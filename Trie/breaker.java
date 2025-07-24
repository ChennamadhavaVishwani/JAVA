public class breaker {
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

public static boolean wordBreak(String key){
    if(key.length() == 0){
        return true;
    }
    for(int i = 1; i<=key.length(); i++){
        String firstPart = key.substring(0,i);
        String secondPart = key.substring(i);
        if(search(firstPart) && wordBreak (secondPart)){
            return true;
        } 
    }
    return false;
}   
    public static void main(String[] args) {
        String words [] = {"i", "like", "samsung", "sam", "movies", "icecream"} ;
        String key = "ilikesamsung";
        for(int i = 0; i<words.length; i++){
            insert(words[i]);
        }
        System.out.println(wordBreak(key));
    }
}





















// public static void insert(String words){
    //     for(int i = 0; i<words.length(); i++){
    //         int idx = words.charAt(i) - 'a';

    //         if(root.children == null){
    //             root.children[idx] = new Node();
    //         }
    //         if(i == words.length() - 1){
    //             root.children[idx].eow = true;
    //         }
    //         root = root.children[idx];

    //     }
    // }