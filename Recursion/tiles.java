public class tiles {
    public static int placetiles(int n, int m){
        if(n < 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
       
        int vertical = placetiles(n-1,m);
        int horizontal = placetiles(n-m,m);
        return vertical + horizontal;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 2;

        int count = placetiles(4, 2);
        System.out.println("The number of tiles required are: "+ count);

    }
    
}
