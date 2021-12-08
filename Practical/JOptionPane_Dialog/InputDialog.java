import javax.swing.JOptionPane;

public class InputDialog
{
    public static void main(String[] args)
    {
        String no1;
        String no2;
        int ans;
        
        no1 = JOptionPane.showInputDialog(null,"Enter First Name");

        no2 = JOptionPane.showInputDialog(null, "Enter Last Name");

        ans = Integer.parseInt(no1) + Integer.parseInt(no2);

        System.out.println("Answer is " + ans);
    }   
}
