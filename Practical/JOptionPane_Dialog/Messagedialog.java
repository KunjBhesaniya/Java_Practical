import javax.swing.JOptionPane;

public class Messagedialog {
    public static void main(String[] args)
    {
        int a = 10;
        JOptionPane.showMessageDialog(null, "The Value of A is " + a, "Value of A", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Hi SYBCA Div B", "Hi", JOptionPane.QUESTION_MESSAGE);
    }
}
