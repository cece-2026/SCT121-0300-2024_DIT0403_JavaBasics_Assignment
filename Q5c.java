import java.util.Scanner;

public class Q5c
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //code to input numbers into the array
        System.out.print("Input 6 numbers: ");
        int[] a = new int[6];
        for(int i=0;i<6;i++){
            a[i] = sc.nextInt();
        }

        //code to display the original order
        System.out.print("Original: ");
        for(int n: a) System.out.print(n+" ");
        System.out.println();

        //codes to move the last element to the front
        int last = a[5];
        for(int i=5;i>0;i--) a[i]=a[i-1];
        a[0]=last;
        System.out.print("Right shift: ");
        for(int n: a) System.out.print(n+" ");
        System.out.println();

         //codes to move the first two elements to the back
         int first = a[0];
         int second = a[1];
         for(int i=0;i<4;i++)
         {
           a[i] = a[i+2];           
          }  
         a[4] = first;          
         a[5] = second;         

        System.out.print("Left rotate by 2: ");
        for(int n: a) System.out.print(n+" ");    
        }
}
