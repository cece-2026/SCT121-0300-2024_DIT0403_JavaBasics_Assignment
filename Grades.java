import java.util.Scanner;

public class Grades
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        //code to capture the marks
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        
        //code to output result        
        if(marks < 0 || marks > 100) 
        System.out.println("Invalid marks!");
        
        else if(marks >= 70) 
        System.out.println("Grade A - Excellent");
        
        else if(marks >= 60) 
        System.out.println("Grade B - Very Good");
        
        else if(marks >= 50)
        System.out.println("Grade C - Good");
        
        else if(marks >= 40) 
        System.out.println("Grade D - Pass");
        
        else System.out.println("Grade E - Fail");
    }
}
