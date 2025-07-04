public class mazepath {
    public static int func(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j== n-1){
            return 1;
        }

        int downpath = func(i+1, j, n , m);

        int rightpath = func(i, j+1, n, m);

        return downpath+rightpath;

    }
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int count = func(0, 0, 3,3);
        System.out.println("The available paths are: " + count);
    }
}
