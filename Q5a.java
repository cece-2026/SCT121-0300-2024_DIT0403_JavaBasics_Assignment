import java.util.Scanner;

public class Q5a
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[8];
        int sum=0, pass=0, fail=0;

        for(int i=0;i<marks.length;i++)
        {
            System.out.print("Enter mark for student " + (i+1) + ": ");
            marks[i] = sc.nextInt();
            sum += marks[i];
            if(marks[i]>=50) pass++; else fail++;
        }

        int highest = marks[0], lowest = marks[0];
        for(int m: marks){
            if(m>highest) highest=m;
            if(m<lowest) lowest=m;
        }

        double avg = (double)sum/marks.length;

        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Passed: " + pass + ", Failed: " + fail);

        System.out.println("Marks in reverse:");
        for(int i=marks.length-1;i>=0;i--)
        {
            System.out.print(marks[i] + " ");
        }
    }
}
