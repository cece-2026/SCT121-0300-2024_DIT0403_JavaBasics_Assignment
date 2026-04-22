import java.util.Scanner;

public class Q1a{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        //code to capture the name 
        System.out.print("Enter your full name: ");
        String name = sc.nextLine();

        //code to capture the age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        //code to capture the height
        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();

        //code to display text
        System.out.println("Your name is " + name + ". You are " + age + " years old and " + height + " meters tall.");
    }
}
