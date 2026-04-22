import java.util.Scanner;

public class Q3b
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //code to input gender
        System.out.print("Enter gender: ");
        String gender = sc.next();
        
        //code to input salary
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        //code to compute the rate
        double Rate= 0;
        if(gender.equals("Male")){
           if (salary<30000){
              Rate= 0.10;
            }
            else{
                 Rate= 0.15;
            }
           }
           
        if(gender.equals("Female")){
            if (salary<25000){
            Rate= 0.08;
            }
            else{
            Rate= 0.12;
            }
           }
        //code to compute tax and net salary
        double tax = salary * Rate;
        double net = salary - tax;
        //code to display results
        System.out.println("Gender: " + gender + "\n Salary: " + salary + "\n Rate: " + Rate + "\n Tax: " + tax + "\n Net Salary: " + net);
    }
}
