public class sudoku {
   public boolean isSafe(char[][] board, int row, int col, int num) {
        char ch = (char)(num + '0');

        for (int idx = 0; idx < board.length; idx++) {
            if (board[idx][col] == ch) {
                return false;
            }
            if (board[row][idx] == ch) {
                return false;
            }
        }

        int sr = row / 3 * 3;
        int sc = col / 3 * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == ch) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean helper(char[][] board,int row, int col){
        if(row == board.length){
            return true;
        }
        int nrow = 0;
        int ncol = 0;

        if(col!= board.length -1){
            nrow = row;
            ncol = col -1;
        }else{
            nrow = row + 1;
            col = 0;
        }

        if(board[row][col] != '.'){
            if (helper(board, nrow, ncol)){
                return true;
            }
        } else{
            for(int i = 0; i<=9; i++){
                if(isSafe(board, row, col, i)){
                    board[row][col] = (char)(i + '0');
                    if(helper(board, nrow, ncol)){
                        return true;
                    }else{
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board){
        helper(board, 0, 0);
    }

    public static void main(String[] args) {
    sudoku solver = new sudoku();
    char[][] board = {
        {'5','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}
    };

    System.out.println("Original Sudoku:");
    printBoard(board);

    solver.solveSudoku(board);

    System.out.println("\nSolved Sudoku:");
    printBoard(board);
}


public static void printBoard(char[][] board) {
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            System.out.print(board[i][j] + " ");
        }
        System.out.println();
    }
}

}
