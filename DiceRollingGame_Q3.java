import java.util.Random;
import java.util.Scanner;

public class DiceRollingGame_Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for board size and number of sides on the dice
        System.out.print("Enter the board size: ");
        int boardSize = scanner.nextInt();

        System.out.print("Enter the number of sides on the dice: ");
        int diceSides = scanner.nextInt();

        int[][] board = new int[boardSize][boardSize];
        int x = 0;
        board[boardSize - 1][x] = 1; // Initial position of the pointer 'x'

        Random random = new Random();

        for (int iteration = 1; ; iteration++) {
            int diceRoll = random.nextInt(diceSides) + 1; // Random number from 1 to diceSides

            // Clear the current position of 'x'
            board[boardSize - 1][x] = 0;

            // Move 'x' according to the dice roll
            x += diceRoll;

            // Ensure 'x' stays within the bounds of the array
            if (x >= boardSize) {
                System.out.println("Game over! 'x' reached the end.");
                break;
            }

            // Update the new position of 'x'
            board[boardSize - 1][x] = 1;

            // Display the board for this iteration
            System.out.println("Iteration " + iteration + " (Number generated: " + diceRoll + ")");
            printBoard(board);
            System.out.println();

            // Sleep for a moment to see the board
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        scanner.close();
    }

    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell == 1 ? "x " : "0 ");
            }
            System.out.println();
        }
    }
}
