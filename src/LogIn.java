import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn extends Container {

    private MainInterface mainFrame;
    private JPanel logInPanel;
    private JLabel logInLabel;
    private JLabel userLabel;
    private JPasswordField passwordField;
    private JButton logInButton;
    private JButton registrarmeButton;
    private JLabel passwordLabel;
    private JTextField userTextField;
    private JLabel welcomeLabel;



    public LogIn(MainInterface mainFrame) {
        this.mainFrame = mainFrame;

        registrarmeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.showRegister();
            }
        });
    }

    public JPanel getPanel(){ return this.logInPanel;}
}
