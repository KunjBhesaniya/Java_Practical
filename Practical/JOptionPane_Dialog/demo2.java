import javax.swing.JOptionPane;

public class demo2
{
    public static void main(String[] args)
    {
        String n1, n2;
        int ans;

        n1 = JOptionPane.showInputDialog(null, "Enter Number 1");

        n2 = JOptionPane.showInputDialog(null, "Enter Number 2");

        ans = Integer.parseInt(n1) + Integer.parseInt(n2);

        System.out.println("Answer " + ans);
    }
}