import java.util.Scanner;

public class Q5b
{
    public static void main(String[] args) 
    {
        int[] arr = {23,45,12,67,34,89,56,78,90,33};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

        int comparisons=0, index=-1;
        for(int i=0;i<arr.length;i++){
            comparisons++;
            if(arr[i]==key)
            {
                index=i;
                break;
            }
        }

        if(index!=-1) System.out.println(key + " found at index " + index);
        else System.out.println("Element not found");
        System.out.println("Total comparisons: " + comparisons);
    }
}
