import java.util.Scanner;
import java.util.Random;
class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        int guess;
        do {
            System.out.print("Guess the number: ");
            guess = sc.nextInt();
            if(guess > randomNumber) {
                System.out.println("Too High");
            } else if(guess < randomNumber) {
                System.out.println("Too Low");
            } else {
                System.out.println("Correct Guess!");
            }

        } while(guess != randomNumber);
    }
}