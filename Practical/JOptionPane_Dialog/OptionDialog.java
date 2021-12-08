import javax.swing.JOptionPane;

public class OptionDialog {
    public static void main(String[] args)
    {
        String buttons[] = {"B1", "B2", "B3", "B4"};

        int b = JOptionPane.showOptionDialog(null, "Choose Option", "Select", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, buttons, "B1");

        System.out.println(b);
    }
}
