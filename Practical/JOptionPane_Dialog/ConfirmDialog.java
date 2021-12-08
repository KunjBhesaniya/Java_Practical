import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ConfirmDialog {
    public static void main(String[] args)
    {
        String jpg;
        ImageIcon icon = new ImageIcon("1.jpg");

        int input = JOptionPane.showConfirmDialog(null, "Do you like Java?", "Please Answer", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, icon);

        System.out.println(input);
    }
    
}
