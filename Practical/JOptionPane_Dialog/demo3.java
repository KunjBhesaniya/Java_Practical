import javax.swing.JOptionPane;

public class demo3 {
    public static void main(String[] args)
    {
        int input = JOptionPane.showConfirmDialog(null, "Do you like Java?", "Question", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        System.out.println(input);
    }  
}
