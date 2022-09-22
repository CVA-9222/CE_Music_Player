import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPanel {

    private JPanel registerPanel;
    private MainInterface mainFrame;
    private JLabel registerLabel;
    private JLabel userNameLabel;
    private JTextField usernameTextField;
    private JButton backButton;


    public RegisterPanel(MainInterface mainFrame){
        this.mainFrame = mainFrame;
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showLogIn();
            }
        });
    }
    public JPanel getPanel(){
        return this.registerPanel;
    }

    public void showLogIn(){
        mainFrame.showLogIn();
    }
}
