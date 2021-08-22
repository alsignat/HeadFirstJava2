package SimpleDotComGame;
import java.util.Scanner;

public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        SimpleDotCom game = new SimpleDotCom();
        int start = (int) (Math.random() * 5);
        game.setLocationCells(new int[]{start++, start++, start});
        boolean isAlive = true;
        Scanner sc = new Scanner(System.in);

        while (isAlive) {
            System.out.print("enter a number ");
            String s = sc.next();
            numOfGuesses++;
            game.checkYourself(s);
            isAlive = game.numOfHits < game.locationCells.length;
            if (!isAlive) {
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}