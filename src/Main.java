import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);


        String playAgain;
        do {
            int die1 = rnd.nextInt(6);
            int die2 = rnd.nextInt(6);
            int point = die1 + die2;

            System.out.println(" You rolled " + die1 + "," + die2 + " and the point is " + point);
            if (point == 7 || point == 11) {
                System.out.println("You win!");
            } else if (point == 2 || point == 3 || point == 12) {
                System.out.println("You lose!");
            } else {
                int roll = 0;
                while (roll != 7) {
                    die1 = rnd.nextInt(6);
                    die2 = rnd.nextInt(6);
                    roll = die1 + die2;
                    System.out.println(" You rolled a " + roll);
                    if (point == roll) {
                        System.out.println("You win!");
                    } else if (roll == 7) {
                        System.out.println("You lose!");
                    }
                }
            }
            System.out.println("Would you like to play again? Y/N");
            playAgain = in.nextLine();
        }
        while (playAgain.equals("Y"));
    }
}