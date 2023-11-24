public class AlphabetTask_Q4 {
    public static void main(String[] args) {
        char[][] board = new char[10][10];

       {
         // Initialize the board with spaces
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = ' ';
            }
        }

        // Letter 'K'
        for (int i = 0; i < 9; i++) {
            board[i][0] = '1';
        }
        
        board[0][6] = '1';
        board[1][5] = '1';
        board[2][4] = '1';
        board[3][3] = '1';
        board[4][2] = '1';
        board[4][1] = '1';
        board[5][3] = '1';
        board[6][4] = '1';
        board[7][5] = '1';
        board[8][6] = '1';

        System.out.println();
        System.out.println();


        // Print the board
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
       }


       //print I
       {
         // Initialize the board with spaces
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = ' ';
            }
        }

        // Letter 'I'
        for (int i = 0; i < 9; i++) {
            board[0][i] = '1';
        }
        
        board[0][4] = '1';
        board[1][4] = '1';
        board[2][4] = '1';
        board[3][4] = '1';
        board[4][4] = '1';
        board[5][4] = '1';
        board[6][4] = '1';
        board[7][4] = '1';
        board[8][4] = '1';

        for (int i = 0; i < 9; i++) {
            board[9][i] = '1';
        }

        System.out.println();
        System.out.println();


        // Print the board
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
       }

       //print N

       {
        // Initialize the board with spaces
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = ' ';
            }
        }

        // Letter 'N'
        for (int i = 0; i < 9; i++) {
            board[i][1] = '1';
        }
        
        board[1][2] = '1';
        board[2][3] = '1';
        board[3][4] = '1';
        board[4][5] = '1';
        board[5][6] = '1';
        board[6][7] = '1';
        board[7][8] = '1';
        

        for (int i = 0; i < 9; i++) {
            board[i][9] = '1';
        }

        System.out.println();
        System.out.println();


        // Print the board
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
       }


       //This is for G
       {

        // Initialize the board with spaces
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = ' ';
            }
        }

        // Letter 'I'
        for (int i = 0; i < 10; i++) {
            board[0][i] = '1';
        }
        for (int i = 0; i < 9; i++) {
            board[i][0] = '1';
        }
        
        board[5][6] = '1';
        board[5][7] = '1';
        board[5][8] = '1';
        board[5][9] = '1';
        board[6][9] = '1';
        board[7][9] = '1';
        board[8][9] = '1';

        for (int i = 0; i < 10; i++) {
            board[9][i] = '1';
        }

        System.out.println();
        System.out.println();


        // Print the board
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

       }
    }
}
