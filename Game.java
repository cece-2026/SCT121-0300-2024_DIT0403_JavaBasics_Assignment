import java.util.Scanner;

public class Game
{
    public static void main(String[] args) 
    {
        int target = (int)(Math.random()*50)+1;
        Scanner sc = new Scanner(System.in);
        int guess, attempts=0;

        do
        {
            //code to accept input of the guess
            System.out.print("Guess a number between 1 and 50: ");
            guess = sc.nextInt();
            attempts++;
            
            if(guess>target) System.out.println("Too high!");
            else if(guess<target) System.out.println("Too low!");
        }
         while(guess!=target);

        //code to display results
        System.out.println("You guessed correctly. You made attempts: " + attempts);
    }
}
