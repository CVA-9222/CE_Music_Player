import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MusicPlayerGUI extends JFrame{
    private JPanel mainPanel;
    private JTextField nameTextField;
    private JLabel NombreLabel;
    private JButton AcceptButton;
    private JLabel PasswordLabel;

    public MusicPlayerGUI (String title){
        super (title);

        this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        AcceptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // grab the text from the nametext field
                //convert to the double
                //update the fahrenheitLabel
                int tempFahr= (int) ((Double.parseDouble(nameTextField.getText()))
                        * 1.8 + 32);
                PasswordLabel.setText (tempFahr + "Fahrenheit");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new MusicPlayerGUI ( "Music Player");
        frame.setVisible (true);
    }
}
