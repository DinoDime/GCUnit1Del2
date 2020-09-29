package GCPrework;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner JavaInput = new Scanner(System.in);
        System.out.println("Guess which will have more: heads or tails? ");
        String headsOrTailsGuess = JavaInput.nextLine();
        System.out.println("How many times shall we flip a coin?");
        int numberOfFlips = JavaInput.nextInt();
        int correctCount = 0;
        double percentageRight = 0;
        String coinFlip = null;
        int randomNumber = 0;
        int minRange = 1;
        int maxRange = 2;
        int range = maxRange - minRange + 1;
        for (int i = 1; i <= numberOfFlips; i++){
            randomNumber = (int)(Math.random() * range);
            if (randomNumber == 1){
               coinFlip = "heads";
            }
            else{
                coinFlip = "tails";
            }
            System.out.println(coinFlip);
            if (headsOrTailsGuess.equals(coinFlip)){
                correctCount++;
            }
        }
        percentageRight = (double) correctCount / (double) numberOfFlips *100;
        System.out.println("Your guess, " + headsOrTailsGuess + ", came up " + correctCount + " time(s).");
        System.out.println("That's " + percentageRight + "%.");
    }
}
