import javax.swing.JOptionPane;

public class Food
{
    public static void main(String[] args) 
    {
        
        //code to capture favourite food using a Dialogue box
        String food = JOptionPane.showInputDialog("Enter your favourite food:");
        
        //code to capture favourite food using a dialogue box
        String colour = JOptionPane.showInputDialog("Enter your favourite colour:");

        //Displays text using a dialogue box
        JOptionPane.showMessageDialog(null, "Your favourite food is " + food + " and favourite colour is " + colour);
    }
}
