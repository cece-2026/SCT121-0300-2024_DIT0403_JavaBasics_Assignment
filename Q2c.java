import java.util.Scanner;

public class Q2c
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        //code to accepts a number from the user        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //code to determine if code is even or odd
        System.out.println(number + " is " + (number%2==0 ? "EVEN" : "ODD"));
        
        //code to determine if code is divisible by 5
        System.out.println(number + (number%5==0 ? " is divisible by 5" : " is NOT divisible by 5"));
        
        //code to determine if code is divisible by 3
        System.out.println("Remainder when divided by 3: " + (number%3));
    }
}
