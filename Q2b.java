import java.util.Scanner;

public class Q2b{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        //code to capture the first number
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        
        //code to capture the second number
        System.out.print("Enter y: ");
        int y = sc.nextInt();

        //code to compute and display results
        System.out.println( x + " > " + y + ": " + (x > y));
        System.out.println(x + " < " + y + ": " + (x < y));
        System.out.println(x + " == " + y + ": " + (x == y));
        System.out.println("Both even: " + (x%2==0 && y%2==0));
        System.out.println("At least one positive: " + (x>0 || y>0));
    }
}
