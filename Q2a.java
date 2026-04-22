import java.util.Scanner;

public class Q2a{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        //code to capture the radius
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        //code to compute the circumference and the area
        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.pow(radius, 2) * Math.PI;

        //code to display results
        System.out.printf("Diameter = %.2f \n Circumference = %.2f \n Area = %.2f \n", diameter, circumference, area);
    }
}
