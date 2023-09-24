import java.util.Random;
import java.util.Scanner;

public class GusserGame {
    

    public static void main(String [] arg){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxTries = 0;
        int score = 0;
        boolean playAgain = true;
        System.out.println("Welcome to the gusser name");
        while(playAgain){
            int lowerGuess, upperGuess;
            int difficultyChoice;

            System.out.println("\nCho0se a Difficult Level");
            System.out.println("1.Easy (1 - 30)");
            System.out.println("2.Medium (1 - 50)");
           

            difficultyChoice = scanner.nextInt();

            switch (difficultyChoice) {
                case 1:
                    lowerGuess = 1;
                    upperGuess = 30;
                    maxTries = 10;
                    break;

                case 2:
                lowerGuess = 1;
                upperGuess = 50;
                maxTries = 8;
                break;

                default:
                    lowerGuess = 1;
                    upperGuess = 30;
                    maxTries = 10;
                    break;
            }
            int numberToGuess = random.nextInt(upperGuess - lowerGuess + 1)+lowerGuess;
            int numberOfTries = 0;
            boolean guessCorrectly = false;

            System.out.println("Round Started :- Try to guess the number");
            System.out.println("You have "+maxTries+" tries to guess the number between "+lowerGuess+" to upper guess "+upperGuess);

            while(numberOfTries < maxTries && !guessCorrectly){
                System.out.println("Attempt "+(numberOfTries+1) + "  Enter your guess");
                int userGuess = scanner.nextInt();
                numberOfTries++;
                if(userGuess < lowerGuess || userGuess > upperGuess){
                    System.out.println("Your Guess is out of range between "+lowerGuess+ " and " +upperGuess);

                }else if(userGuess < numberToGuess){
                    System.out.println("try to guess higher value");

                }else if(userGuess > numberToGuess){
                    System.out.println("try to guess lowe values");
                }else{
                    guessCorrectly = true;
                    System.out.println("Congratulations you guessed the correct number which is " +numberToGuess+".");
                    System.out.println("it took you" +numberOfTries+"tries");
                    score = maxTries - numberOfTries +1;

                }
            }
            if(guessCorrectly != false){
                System.out.println("You failed to guess correctly and the  correct number was "+ numberToGuess );

            }
            System.out.println("Your score is "+score);
            System.out.println("Do you want play again (Yes/No)");
            String playAgainInput = scanner.next();
            if(playAgainInput.equalsIgnoreCase("no")){
                playAgain = false;
            }
        }
        System.out.println("Thanks for playing your final score is " +score);
       


    }
    
}
