public class Total
{
    public static void main(String[] args) 
    {
        //code to calculate the sum
        int sum=0, count=0;
        for(int i=2;i<=100;i+=2){
            sum+=i; count++;
        }
        //code to compute average
        double avg = (double)sum/count;
        //code to diaply output
        System.out.println("Sum: " + sum + "\n Count: " + count + "\n Average: " + avg);
    }
}
