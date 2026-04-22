import javax.swing.JOptionPane;

public class Q1c{
    public static void main(String[] args) 
    {
        
        //code to input the first number using a Dialogue box
        String num1 = JOptionPane.showInputDialog("Enter first number:");
        
        //code to input the first number using a Dialogue box
        String num2 = JOptionPane.showInputDialog("Enter second number:");

        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);

        //Displays text using a dialogue box
        JOptionPane.showMessageDialog(null, "First number: " + num1 + "\n Second number: " + num2 + " \n Sum: " + (a+b) + "\n Difference: " + (a-b) + "\n Product: " + (a*b) + "\n Quotient: " + (a/b));
    }
}
