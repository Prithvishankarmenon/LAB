import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadder {

    private static final int WIN_POSITION = 100;
    private static final int BOARD_SIZE = 10; // 10x10 board

    private final HashMap<Integer, Integer> snakes;
    private final HashMap<Integer, Integer> ladders;
    private final Random random;
    private final Scanner scanner;

    public SnakeAndLadder() {
        snakes = new HashMap<>();
        ladders = new HashMap<>();
        random = new Random();
        scanner = new Scanner(System.in);
        // You can add your snakes and ladders here
        addSnake(6, 16);
        addLadder(31, 45);
    }

    public void addSnake(int start, int end) {
        if (start >= end) {
            throw new IllegalArgumentException("Start position cannot be greater than or equal to end position for a snake.");
        }
        snakes.put(start, end);
    }

    public void addLadder(int start, int end) {
        if (start >= end) {
            throw new IllegalArgumentException("Start position cannot be greater than or equal to end position for a ladder.");
        }
        if (end > WIN_POSITION) {
            throw new IllegalArgumentException("Ladder cannot end beyond the winning position.");
        }
        ladders.put(start, end);
    }

    public void playGame() {
        int playerPosition = 0;
        int turn = 1;

        while (playerPosition < WIN_POSITION) {
            System.out.println("Turn " + turn);
            System.out.println("Player " + (turn % 2 == 1 ? 1 : 2) + "'s turn. Press Enter to roll the dice.");
            scanner.nextLine();

            int diceRoll = random.nextInt(6) + 1;
            System.out.println("You rolled a " + diceRoll);

            int newPosition = playerPosition + diceRoll;

            // Check for snakes and ladders
            if (snakes.containsKey(newPosition)) {
                System.out.println("Oh no! You landed on a snake. Slithering down to " + snakes.get(newPosition));
                newPosition = snakes.get(newPosition);
            } else if (ladders.containsKey(newPosition)) {
                System.out.println("Yay! You climbed a ladder to " + ladders.get(newPosition));
                newPosition = ladders.get(newPosition);
            }

            // Limit position to board size
            playerPosition = Math.min(newPosition, BOARD_SIZE * BOARD_SIZE);

            System.out.println("You are now at position " + playerPosition);

            if (playerPosition == WIN_POSITION) {
                System.out.println("Player " + (turn % 2 == 1 ? 1 : 2) + " wins!");
                break;
            }

            turn++;
        }

        scanner.close();
    }

    public static void main(String[] args) {
        SnakeAndLadder game = new SnakeAndLadder();
        game.playGame();
    }
}
