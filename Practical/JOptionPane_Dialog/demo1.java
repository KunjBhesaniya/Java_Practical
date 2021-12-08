import javax.swing.JOptionPane;

class demo1
{
    public static void main(String[] args)
    {
        int a = 10;
        JOptionPane.showMessageDialog(null, "The Value of A is "+ a, "Value of A", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Hello World", "Info", JOptionPane.QUESTION_MESSAGE);
    }
}